package br.com.impacta.math;

public class Megasena {

  public static void main(String[] args) {
    
    for (int i = 0; i < 6; i++) {
      int numero = sortearNumero();
      System.out.print(numero);
      System.out.print(" ");
    }
  }

  private static int sortearNumero() {
    return (int) (Math.random() * 60) + 1;
  }
}
