package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe Responsável por abrir uma conexão como o BD
 * @author Marcos
 *
 */
public class ConnectionFactory {

	public Connection getConnection(){
		try {
			return
					DriverManager.getConnection("jdbc:mysql://localhost/fj21","root","Y0d@NOD3");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
