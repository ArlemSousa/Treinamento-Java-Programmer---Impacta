package br.com.cursojava.exemplo;

import java.io.IOException;
import java.util.Properties;

public class ExemploProperties {

  public static void main(String[] args) {
    
    try {

      Properties props = new Properties();
      props.load(
          ExemploProperties.class.getResourceAsStream(
              "/resource/exemplo.properties"));

      String nome = props.getProperty("user.name");
      String acessos = props.getProperty("qtd.acesso");
      
      System.out.printf(
          "O usuario %s acessou %s vezes",
          nome, acessos);
      
    } catch (IOException e) {
      System.out.println(
          "Falha ao carregar as configuracoes.");
      e.printStackTrace();
    }
  }
}
