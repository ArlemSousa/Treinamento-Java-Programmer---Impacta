package br.com.impacta.string;

public class ExercicioString {

  public static void main(String[] args) {

    String frase = "   Java � divertido          ";
    
    System.out.println(
        frase.trim().toUpperCase().concat("!!!"));
  }
}
