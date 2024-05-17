package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploStatement {

  public static void main(String[] args) {
    
    try {

      Connection cn = DriverManager.getConnection(
          "jdbc:mysql://2p3_instrutor:3306/impacta",
          "aluno", "java");

      Statement st = cn.createStatement();
      int qtd = st.executeUpdate(
        "DELETE FROM tab_role WHERE role_name = 'padeiro'");
      
      st.close();
      cn.close();
      
      System.out.println(
          qtd + " linhas removidas com sucesso.");
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
