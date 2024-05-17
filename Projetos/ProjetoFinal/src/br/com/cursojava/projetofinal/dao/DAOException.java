package br.com.cursojava.projetofinal.dao;

public class DAOException extends Exception {

  public DAOException(String mensagem, Throwable ex) {
    super(mensagem, ex);
  }
}
