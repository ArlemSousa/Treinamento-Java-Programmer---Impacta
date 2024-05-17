package br.com.impacta.math;

public class TabuadaPotencia {

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
//        System.out.println(
//            i + " elevado a " + j +
//            " = " + Math.pow(i, j));

        System.out.printf(
            "%d elevado a %d = %,.0f\n",
            i, j, Math.pow(i, j));
      }
      System.out.println();
    }
  }
}
