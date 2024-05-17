package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.projetofinal.vo.CargoVO;

public class CargoDAO extends AbstractDAO {

  public void save(CargoVO cargo) throws DAOException {

    Connection cn = null;
    PreparedStatement ps = null;

    try {

      cn = getConnection();
      ps = cn
          .prepareStatement("INSERT INTO tab_role (role_name) VALUES (?)");

      ps.setString(1, cargo.getNome());
      ps.executeUpdate();

    } catch (SQLException e) {

      throw new DAOException(
          "Falha ao gravar o cargo", e);

    } finally {
      close(cn, ps, null);
    }
  }

  public List<CargoVO> findAll() throws DAOException {

    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;

    List<CargoVO> lista = null;
    CargoVO cargo = null;

    try {

      cn = getConnection();
      st = cn.createStatement();
      rs = st
          .executeQuery("SELECT role_code, role_name FROM tab_role "
              + "ORDER BY role_name");

      /* Cria uma lista vazia */
      lista = new ArrayList<>();

      while (rs.next()) {

        /* Cria um cargo vazio */
        cargo = new CargoVO();

        /* Preenche o cargo */
        cargo.setId(rs.getInt("role_code"));
        cargo.setNome(rs.getString("role_name"));

        /* Adiciona o cargo a lista */
        lista.add(cargo);
      }

      return lista;

    } catch (SQLException e) {
      throw new DAOException(
          "Falha ao obter lista de cargos", e);
    } finally {
      close(cn, st, rs);
    }
  }

  public List<CargoVO> findByName(String pedaco)
      throws DAOException {

    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<CargoVO> lista = null;
    CargoVO cargo = null;

    try {

      cn = getConnection();
      ps = cn.prepareStatement(
          "SELECT role_code, role_name " +
          "FROM tab_role WHERE role_name LIKE ?");

      ps.setString(1, pedaco);
      rs = ps.executeQuery();
      
      lista = new ArrayList<>();
      
      while (rs.next()) {

        cargo = new CargoVO();
        cargo.setId(rs.getInt("role_code"));
        cargo.setNome(rs.getString("role_name"));
        
        lista.add(cargo);
      }
      
      return lista;
      
    } catch (SQLException e) {
      throw new DAOException(
          "Falha ao obter lista de cargos", e);
    } finally {
      close(cn, ps, rs);
    }
  }
}
