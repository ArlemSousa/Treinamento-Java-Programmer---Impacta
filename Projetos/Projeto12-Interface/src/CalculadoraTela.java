
public class CalculadoraTela implements Calculadora {

  public void exibeSoma(double valor1, double valor2) {
    double soma = valor1 + valor2;
    System.out.println(soma);
  }

  public void exibeSubtracao(double valor1,
      double valor2) {
    double sub = valor1 - valor2;
    System.out.println(sub);
  }

  public void exibeMultiplicacao(double valor1,
      double valor2) {
    double multi = valor1 * valor2;
    System.out.println(multi);
  }

  public void exibeDivisao(double valor1,
      double valor2) {
    double div = valor1 / valor2;
    System.out.println(div);
  }
}
