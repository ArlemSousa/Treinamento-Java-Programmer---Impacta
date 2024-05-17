
public class ExecutaPrograma {

  public static void main(String[] args) {
    
    FiguraGeometrica[] listaFiguras = {
      new Quadrado(4),
      new Triangulo(3, 4),
      new Quadrado(6.5),
      new Circulo(2),
      new Triangulo(6.5, 10),
      new Circulo(3),
      new Triangulo(6, 9),
      new Quadrado(78.2)
    };

    int totalQuad = 0;
    
    for (FiguraGeometrica f : listaFiguras) {
      System.out.println(f.getArea());
      
      if (f instanceof Quadrado) {
        totalQuad++;
      }
    }
    
    System.out.println();
    System.out.println("Total de quadrados: " +
        totalQuad);
    
  }
}



