package br.com.cursojava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ExercicioProcedure {

  public static void main(String[] args) {
    
    try {

      /* Abre a conexao com a base de dados */
      Connection cn = DriverManager.getConnection(
          "jdbc:mysql://2p3_instrutor:3306/impacta?noAccessToProcedureBodies=true",
          "aluno", "java");

      /* Prepara a chamada da procedure */
      CallableStatement cs = cn.prepareCall(
          "{ call prc_numero_extenso(?, ?) }");
      
      /* Coleta o numero digitado pelo usuario */
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite um numero inteiro: ");
      String texto = sc.nextLine();
      int numero = Integer.parseInt(texto);

      /* Preenche o parametro de entrada */
      cs.setInt(1, numero);
      
      /* Registra o parametro de saida */
      cs.registerOutParameter(2, Types.VARCHAR);
      
      /* Executa a procedure */
      cs.executeUpdate();
      
      /* Obtem o parametro de saida gerado pela procedure */
      String mensagem = cs.getString(2);
      
      /* Imprime a mensagem */
      System.out.println(mensagem);
      
      /* Fecha o statement e a conexao */
      cs.close();
      cn.close();
      
    } catch (NumberFormatException nfe) {
      System.out.println("Numero invalido!");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
