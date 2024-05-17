package br.com.impacta.cursojava.jar;

import br.com.impacta.noticiario.Noticiario;
import br.com.impacta.noticiario.TipoNoticia;

public class TesteJar {

  public static void main(String[] args) {
    
    Noticiario notic = new Noticiario(
        TipoNoticia.ESPORTE);
    String msg = notic.getNoticia();
    
    System.out.println(msg);
  }
}
