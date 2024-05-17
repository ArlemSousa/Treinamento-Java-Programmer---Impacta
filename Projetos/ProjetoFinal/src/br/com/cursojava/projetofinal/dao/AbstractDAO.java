package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO {

  protected Connection getConnection()
      throws SQLException {

    Connection cn = DriverManager.getConnection(
        "jdbc:mysql://2p3_instrutor:3306/impacta",
        "aluno", "java");

    return cn;
  }

  protected void close(Connection cn, Statement st,
      ResultSet rs) {

    /* Tenta fechar o result set */
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
      }
    }

    /* Tenta fechar o statement */
    if (st != null) {
      try {
        st.close();
      } catch (SQLException e) {
      }
    }

    /* Tenta fechar a connection */
    if (cn != null) {
      try {
        cn.close();
      } catch (SQLException e) {
      }
    }
  }
}
