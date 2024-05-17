package br.com.cursojava.exercicio;

import java.io.File;

public class ExercicioDiretorio {

  public static void main(String[] args) {
    
    /* Referencia a pasta raiz */
    File raiz = new File(
        "C:\\Users\\svieira\\Desktop\\documentos");

    File jpg = new File(raiz, "imagens");
    File mp3 = new File(raiz, "mp3");
    File pdf = new File(raiz, "pdf");

    /* Cria os diretorios */
    jpg.mkdir();
    mp3.mkdir();
    pdf.mkdir();

    /* obtem o conteudo da pasta raiz */
    File[] arrayArquivos = raiz.listFiles();

    for (File f : arrayArquivos) {
      
      System.out.println(f.getName() + "...");
      
      if (f.getName().endsWith(".jpg") ||
          f.getName().endsWith(".gif") ||
          f.getName().endsWith(".png")) {
        File destino = new File(jpg, f.getName());
        f.renameTo(destino);
      } else if (f.getName().endsWith("mp3") ||
          f.getName().endsWith("mp4") ||
          f.getName().endsWith("mkv")) {
        File destino = new File(mp3, f.getName());
        f.renameTo(destino);
      } else if (f.getName().endsWith(".pdf")) {
        File destino = new File(pdf, f.getName());
        f.renameTo(destino);
      }
    }
  }
}
