package br.com.impacta.data;

import java.util.Calendar;

public class ExercicioNatal2 {

  public static void main(String[] args) {
    
    Calendar natal = Calendar.getInstance();
    Calendar hoje = Calendar.getInstance();

    hoje.set(Calendar.MONTH, 0);
    hoje.set(Calendar.DAY_OF_MONTH, 1);

    natal.set(Calendar.MONTH, 11);
    natal.set(Calendar.DAY_OF_MONTH, 31);

    int diaNatal = natal.get(Calendar.DAY_OF_YEAR);
    int diaHoje = hoje.get(Calendar.DAY_OF_YEAR);
    
    int diferenca = diaNatal - diaHoje;
    
    System.out.println("Faltam " + diferenca +
        " dias para o natal");
  }
}
