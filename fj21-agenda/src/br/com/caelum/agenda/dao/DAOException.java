package br.com.caelum.agenda.dao;

import java.sql.SQLException;

public class DAOException extends RuntimeException {

	public DAOException(SQLException e) {
		System.out.println("Erro do SQL");
		e.getErrorCode();
		e.getMessage();
		e.getCause();
		e.getNextException();
	}

}
