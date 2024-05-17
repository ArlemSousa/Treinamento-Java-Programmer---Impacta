
public class ProgramaCalculadora {

  public static void main(String[] args) {
    
    Calculadora[] calcLista = {
      new CalculadoraPopup(),
      new CalculadoraTela(),
      new CalculadoraArquivo()
    };
    
    for (Calculadora c : calcLista) {
      c.exibeMultiplicacao(27, 13);
    }
  }
}
