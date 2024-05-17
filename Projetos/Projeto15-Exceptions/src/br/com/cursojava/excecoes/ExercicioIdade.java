package br.com.cursojava.excecoes;

import java.util.Calendar;
import java.util.Scanner;

public class ExercicioIdade {

  public static void main(String[] args) {
    
    System.out.println(
        "Digite o ano do seu nascimento:");
    
    Scanner sc = new Scanner(System.in);
    String textoDigitado = sc.nextLine();

    try {

      Calendar agora = Calendar.getInstance();
      int anoAtual = agora.get(Calendar.YEAR);
      
      int ano = Integer.parseInt(textoDigitado);
      int idade = anoAtual - ano;

      System.out.println("Parabens pelos seus " +
          idade + " anos de vida.");

    } catch (NumberFormatException nfe) {
      System.out.println("Valor digitado invalido!");
    }
  }
}
