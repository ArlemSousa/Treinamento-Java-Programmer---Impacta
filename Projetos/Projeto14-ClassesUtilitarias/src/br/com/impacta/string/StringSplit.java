package br.com.impacta.string;

public class StringSplit {

  public static void main(String[] args) {
    
    String frase = "Manuel Silva;Antunes;Oliveira";
    String[] palavras = frase.split(";");
    
    System.out.println(palavras[0]);
    System.out.println(palavras[1]);
    System.out.println(palavras[2]);
  }
}
