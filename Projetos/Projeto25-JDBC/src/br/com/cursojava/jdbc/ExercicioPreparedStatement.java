package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioPreparedStatement {

  public static void main(String[] args) {
    
    try {

      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://2p3_instrutor:3306/impacta",
        "aluno", "java");
      PreparedStatement ps = cn.prepareStatement(
        "INSERT INTO tab_role (role_name) VALUES (?)");

      Scanner sc = new Scanner(System.in);

      System.out.print("Digite um cargo: ");
      String nome = sc.nextLine();
      
      while (nome != null && nome.trim().length() > 0) {
        
        ps.setString(1, nome.trim());
        ps.executeUpdate();

        System.out.print("Digite um cargo: ");
        nome = sc.nextLine();
      }
      
      System.out.println("Cadastro finalizado.");
      ps.close();
      cn.close();
      sc.close();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
