package br.com.cursojava.projetofinal.dao;

public class DAOException extends Exception {

	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(String message, Throwable t) {
		super(message, t);
	}
}
