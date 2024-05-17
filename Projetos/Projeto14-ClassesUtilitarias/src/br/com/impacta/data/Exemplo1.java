package br.com.impacta.data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo1 {

  public static void main(String[] args) {
    
    Date agora = new Date();
    SimpleDateFormat mascara = new SimpleDateFormat(
        "EEEE, d 'de' MMMM 'de' yyyy");
    
    System.out.println(
        "Data atual: " + mascara.format(agora));
  }
}
