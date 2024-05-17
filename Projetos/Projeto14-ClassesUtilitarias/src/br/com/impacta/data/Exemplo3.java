package br.com.impacta.data;

import java.util.Calendar;

public class Exemplo3 {

  public static void main(String[] args) {

    /* Cria dois calendários */
    Calendar nasc = Calendar.getInstance();
    Calendar hoje = Calendar.getInstance();

    /* Altera o calendário nasc para o dia do nascimento */
    nasc.set(1988, 0, 15, 12, 10, 30);  //   15/01/1988 12:10:30

    /* Obtem a representação interna dos calendários em milissegundos */
    long intNasc = nasc.getTimeInMillis();
    long intHoje = hoje.getTimeInMillis();

    /* Calcula a idade (em milissegundos) */
    long idade = intHoje - intNasc;

    /* Quantidade de milissegundos em 1 ano */
    long unidade = 1000l * 60 * 60 * 24 * 365;
    
    idade /= unidade;

    /* Exibe a idade */
    System.out.println("Você possui " + idade +
        " anos de idade");
  }
}
