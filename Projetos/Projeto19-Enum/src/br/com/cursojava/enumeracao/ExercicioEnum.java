package br.com.cursojava.enumeracao;

public class ExercicioEnum {

  public static void main(String[] args) {

    Estado[] array = Estado.values();

//    for (Estado e : array) {
//      System.out.printf("A capital de %s é %s\n",
//          e.getNome(), e.getCapital());
//    }

    for (int i = 0; i < array.length; i++) {
//      System.out.printf("A capital de %s é %s\n",
//          array[i].getNome(), array[i].getCapital());

      System.out.println("A capital de " +
          array[i].getNome() + " é " +
          array[i].getCapital());
    }
  }
}
