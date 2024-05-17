package br.com.cursojava.exemplo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExemploGravacao {

  public static void main(String[] args) {
    
    try {

      Writer saida = new FileWriter(
          "C:\\Users\\svieira\\Desktop\\novo.txt");
      
      saida.write("Java é divertido.");
      saida.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
