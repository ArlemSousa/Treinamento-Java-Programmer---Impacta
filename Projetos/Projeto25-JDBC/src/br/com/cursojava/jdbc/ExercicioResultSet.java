package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioResultSet {

  public static void main(String[] args) {
    
    try {

      Connection cn = DriverManager.getConnection(
          "jdbc:mysql://2p3_instrutor:3306/impacta",
          "aluno", "java");

      PreparedStatement ps = cn.prepareStatement(
          "SELECT f.func_name, r.role_name, f.func_rmnt_val FROM tab_func f JOIN tab_role r ON f.role_code = r.role_code WHERE f.func_name LIKE ?");
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um nome: ");
      String pedaco = sc.nextLine();
      
      ps.setString(1, pedaco);
      ResultSet rs = ps.executeQuery();

      String nome;
      String cargo;
      double salario;
      
      while (rs.next()) {
        
        nome = rs.getString("func_name");
        cargo = rs.getString("role_name");
        salario = rs.getDouble("func_rmnt_val");
        
        System.out.printf(
            "%-20s %-20s %,.2f\n",
            nome, cargo, salario);
      }

      rs.close();
      ps.close();
      cn.close();
      
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
