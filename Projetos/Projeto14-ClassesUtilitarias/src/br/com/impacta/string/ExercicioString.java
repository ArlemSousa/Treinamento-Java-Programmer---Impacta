package br.com.impacta.string;

public class ExercicioString {

  public static void main(String[] args) {

    String frase = "   Java é divertido          ";
    
    System.out.println(
        frase.trim().toUpperCase().concat("!!!"));
  }
}
