package br.com.impacta.cursojava.exercicio;

import br.com.impacta.cursojava.funcional.DoubleArrayUtils;

public class MaioresSalarios {

  public static void main(String[] args) {

    double[] salariosBrutos = { 1350, 4320.15,
        8235.25, 2500.55, 1830.00, 850.26, 3614.29,
        12500.00 };

    double[] salariosTop;
    
    salariosTop =
        DoubleArrayUtils.filtraValores(
        salariosBrutos, s -> s >= 2000 && s <= 4000);
    
    for (double salario : salariosTop) {
      System.out.printf("%,.2f\n", salario);
    }
  }
}






