public class Cap6_Lab1 {

  public static void main(String[] args) {

    Funcionario[] funcLista = {
        new Funcionario("Jo�o",
            "das Colves", "Programador", 4200.15),
        new Funcionario("Manuel",
            "Oliveira", "Padeiro", 3800),
        new Funcionario("Maria",
            "da Flores", "Secretaria", 2560.15),
        new Funcionario("Roberto",
            "Justus", "Empres�rio", 1000000)
    };

    for (Funcionario f : funcLista) {
      System.out.println(f.getDados());
    }
  }
}
