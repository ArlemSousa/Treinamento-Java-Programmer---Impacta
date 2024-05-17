package br.com.cursojava.exemplo;

import java.io.File;

public class ExemploListFiles {

  public static void main(String[] args) {
    
    File pasta = new File(
        "X:\\Sábado\\Paulista03\\Instrutor");

    File[] arrayArquivos = pasta.listFiles();
    
    for (File f : arrayArquivos) {
      System.out.println(f.getName());
    }
  }
}
