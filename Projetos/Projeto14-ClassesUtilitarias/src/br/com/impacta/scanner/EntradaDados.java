package br.com.impacta.scanner;

import java.util.Scanner;

public class EntradaDados {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o seu nome:");
    String nome = sc.nextLine();
    
    System.out.println("Ola, " + nome +
        ", como vai?");
  }
}
