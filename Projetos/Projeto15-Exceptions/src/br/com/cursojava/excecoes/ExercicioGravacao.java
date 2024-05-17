package br.com.cursojava.excecoes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma frase");
    
    String frase = sc.nextLine();
    
    try {

      PrintWriter writer = new PrintWriter(
          "C:\\Users\\svieira\\Desktop\\doc1.txt");
      writer.println(frase);
      writer.close();

    } catch (FileNotFoundException e) {
      System.out.println(
          "Falha ao gravar as informações digitadas");
    }
    
    sc.close();
  }
}
