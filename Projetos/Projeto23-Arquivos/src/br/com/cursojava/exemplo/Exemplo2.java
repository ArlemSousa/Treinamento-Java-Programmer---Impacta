package br.com.cursojava.exemplo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo2 {

  public static void main(String[] args) {
    
    File arquivo = new File(
        "X:\\Sábado\\Paulista03\\Instrutor\\Capitulo15\\fotos\\urso.jpg");

    long longData = arquivo.lastModified();
    Date data = new Date(longData);
    SimpleDateFormat mascara =
        new SimpleDateFormat("dd/MM/yyyy HH:ss");
    
    System.out.println(mascara.format(data));
  }
}
