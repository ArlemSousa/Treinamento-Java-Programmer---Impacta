package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.projetofinal.vo.Cargo;

public class CargoDAO extends AbstractDAO {

	public void save(Cargo cargo) throws DAOException {
		
		Connection cn = null;
		PreparedStatement ps = null;
		
		try {
			
			cn = getConnection();
			ps = cn.prepareStatement("INSERT INTO tab_role (role_name) VALUES (?)");
			ps.setString(1, cargo.getNome());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new DAOException("N�o foi poss�vel registrar os dados do cargo especificado.", e);
		} finally {
			closeResources(cn, ps, null);
		}
	}

	public List<Cargo> findAll() throws DAOException {
		
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		List<Cargo> lista = null;
		Cargo cargo = null;
		
		try {

			cn = getConnection();
			st = cn.createStatement();
			rs = st.executeQuery("SELECT role_code, role_name FROM tab_role ORDER BY role_name");

			lista = new ArrayList<>();
			
			while (rs.next()) {
				cargo = new Cargo();
				cargo.setId(rs.getInt("role_code"));
				cargo.setNome(rs.getString("role_name"));
				lista.add(cargo);
			}
			
			return lista;

		} catch (SQLException e) {
			throw new DAOException("Falha ao obter lista de cargos", e);
		} finally {
			closeResources(cn, st, rs);
		}
	}

	public List<Cargo> findByName(String nome) throws DAOException {

		Connection cn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Cargo> lista = null;
		Cargo cargo;
		
		try {

			cn = getConnection();
			ps = cn.prepareStatement("SELECT role_code, role_name FROM tab_role WHERE role_name LIKE ? ORDER BY role_code");
			ps.setString(1, nome);
			rs = ps.executeQuery();
			lista = new ArrayList<>();
			
			while (rs.next()) {
				cargo = new Cargo();
				cargo.setId(rs.getInt("role_code"));
				cargo.setNome(rs.getString("role_name"));
				lista.add(cargo);
			}
			
			return lista;

		} catch (SQLException e) {
			throw new DAOException("Falha ao pesquisar lista de cargos", e);
		} finally {
			closeResources(cn, ps, rs);
		}
	}
}
