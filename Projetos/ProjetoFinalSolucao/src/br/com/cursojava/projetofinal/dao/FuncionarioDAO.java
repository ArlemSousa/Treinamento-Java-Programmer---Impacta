package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.projetofinal.vo.Funcionario;

public class FuncionarioDAO extends AbstractDAO {

	public void save(Funcionario funcionario) throws DAOException {
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {

			cn = getConnection();
			ps = cn.prepareStatement("INSERT INTO tab_func (func_name, func_rmnt_val, role_code) VALUES (?, ?, ?)");

			ps.setString(1, funcionario.getNome());
			ps.setDouble(2, funcionario.getSalario());
			ps.setInt(3, funcionario.getCargoId());
			ps.executeUpdate();

		} catch (SQLException e) {
			throw new DAOException("Nao foi possivel registrar os dados do funcionário.", e);
		} finally {
			closeResources(cn, ps, null);
		}
	}

	public List<Funcionario> findByName(String nome) throws DAOException {
		
		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Funcionario> lista = null;
		Funcionario funcionario;
		
		try {

			cn = getConnection();
			ps = cn.prepareStatement(
					"SELECT f.func_code, f.func_name, r.role_name, f.func_rmnt_val " +
					"FROM tab_func f JOIN tab_role r ON f.role_code = r.role_code " +
				    "WHERE f.func_name LIKE ? ORDER BY f.func_code");

			ps.setString(1, nome);
			rs = ps.executeQuery();
			lista = new ArrayList<>();
			
			while (rs.next()) {
				funcionario = new Funcionario();
				funcionario.setMatricula(rs.getInt("func_code"));
				funcionario.setNome(rs.getString("func_name"));
				funcionario.setCargoNome(rs.getString("role_name"));
				funcionario.setSalario(rs.getDouble("func_rmnt_val"));
				lista.add(funcionario);
			}
			
			return lista;

		} catch (SQLException e) {
			throw new DAOException("Falha ao pesquisar lista de funcionarios", e);
		} finally {
			closeResources(cn, ps, rs);
		}
	}
}
