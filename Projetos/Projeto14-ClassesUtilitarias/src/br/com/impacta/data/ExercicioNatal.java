package br.com.impacta.data;

import java.util.Calendar;

public class ExercicioNatal {

  public static void main(String[] args) {
    
    Calendar natal = Calendar.getInstance();
    Calendar hoje = Calendar.getInstance();

    natal.set(Calendar.MONTH, 11);
    natal.set(Calendar.DAY_OF_MONTH, 25);

    long natalMilli = natal.getTimeInMillis();
    long hojeMilli = hoje.getTimeInMillis();

    long diferenca = natalMilli - hojeMilli;
    long unidade = 1000l * 60 * 60 * 24;
    diferenca /= unidade;

    System.out.println("Faltam " + diferenca +
        " dias para o natal");
  }
}
