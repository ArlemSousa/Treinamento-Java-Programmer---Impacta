package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cursojava.projetofinal.vo.FuncionarioVO;

public class FuncionarioDAO extends AbstractDAO {

  public void save(FuncionarioVO funcionario)
      throws DAOException {

    Connection cn = null;
    PreparedStatement ps = null;
    
    try {
      
      cn = getConnection();
      ps = cn.prepareStatement(
        "INSERT INTO tab_func " +
        "(func_name, func_rmnt_val, role_code) " +
        "VALUES (?, ?, ?)");
      
      ps.setString(1, funcionario.getNome());
      ps.setDouble(2, funcionario.getSalario());
      ps.setInt(3, funcionario.getCargoId());
      ps.executeUpdate();
      
    } catch (SQLException e) {
      throw new DAOException(
        "Falha ao salvar os dados do funcionario", e);
    } finally {
      close(cn, ps, null);
    }
  }
}
