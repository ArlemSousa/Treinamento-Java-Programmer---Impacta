package br.com.cursojava.exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploLeitura {

  public static void main(String[] args) {
    
    try {

      BufferedReader entrada = new BufferedReader(
          new FileReader("C:\\Users\\svieira\\Desktop\\Sandro\\Poema.txt"));

      while (entrada.ready()) {
        System.out.println(entrada.readLine());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
