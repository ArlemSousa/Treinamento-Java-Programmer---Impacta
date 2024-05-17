package br.com.impacta.string;

public class StringExemplo1 {

  public static void main(String[] args) {
    
    String frase1 = "Linguagem Java";
    String frase2 = " é legal";
    String frase3 = " e divertido";
    String frase4 = " asdfasj fdças f";
    
    String result =
        frase1.concat(frase2).concat(frase3).concat(frase4);
    
    System.out.println(frase3);
  }
}
