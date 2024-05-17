package br.com.cursojava.exercicio;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioBusca {

  private static final String FILE_PATH =
      "C:\\Users\\svieira\\Desktop\\1-Java-Programmer-8\\Capitulo15\\lusiadas.txt";
  
  public static void main(String[] args) {
    
    BufferedReader entrada = null;
    
    try {

      System.out.print(
          "Digite o texto a ser procurado: ");
      Scanner sc = new Scanner(System.in);
      String pedaco = sc.nextLine();

      /* Pula uma linha em branco */
      System.out.println();
      
      entrada = new BufferedReader(new FileReader(
          FILE_PATH));
      int cont = 0;

      while (entrada.ready()) {

        String linha = entrada.readLine();
        cont++;
        
        if (linha.contains(pedaco)) {
          System.out.printf("%d: %s\n", cont, linha);
        }
      }
      
      System.out.println();
      System.out.println(
          "Busca concluida com sucesso.");

    } catch (IOException e) {
      System.out.println("Falha ao realizar busca.");
      e.printStackTrace();
    } finally {
      close(entrada);
    }
  }
  
  private static void close(Closeable c) {
    try {
      c.close();
    } catch (Exception e) {}
  }
}
