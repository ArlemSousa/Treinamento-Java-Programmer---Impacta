
public class CalculadoraArquivo extends
    ExibidorNoArquivo implements Calculadora {

  public void exibeSoma(double valor1, double valor2) {
    double temp = valor1 + valor2;
    super.imprimeNoArquivo(temp);
  }

  public void exibeSubtracao(double valor1,
      double valor2) {
    double temp = valor1 - valor2;
    super.imprimeNoArquivo(temp);
  }

  public void exibeMultiplicacao(double valor1,
      double valor2) {
    double temp = valor1 * valor2;
    super.imprimeNoArquivo(temp);
  }

  public void exibeDivisao(double valor1,
      double valor2) {
    double temp = valor1 / valor2;
    super.imprimeNoArquivo(temp);
  }
}
