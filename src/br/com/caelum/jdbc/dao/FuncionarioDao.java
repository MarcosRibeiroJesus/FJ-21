package br.com.caelum.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.jdbc.modelo.Funcionario;

public class FuncionarioDao {

	private Connection connection;

	public FuncionarioDao() {
		this.connection = new ConnectionFactory().getConnection();

	}

	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionarios " + "(nome,usuario,senha)" + " values (?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());

			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new DAOException("Ocorreu um erro ao adicionar um funcionário!");
		}
	}

	public void altera(Funcionario funcionario) {

		String sql = "update funcionarios set nome=?, usuario=?," +

		"senha=? where id=?";

		try {

			PreparedStatement stmt = connection

					.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());

			stmt.setString(2, funcionario.getUsuario());

			stmt.setString(3, funcionario.getSenha());

			stmt.setLong(4, funcionario.getId());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {

			throw new DAOException("Erro ao alterar contato!");

		}

	}

	public void remove(Funcionario funcionario) {

		try {

			PreparedStatement stmt = connection

					.prepareStatement("delete from funcionarios where id=?");

			stmt.setLong(1, funcionario.getId());

			stmt.execute();

			stmt.close();

		} catch (SQLException e) {

			throw new DAOException("Erro ao remover funcionario!");

		}

	}

	// Exercício 2.13.1
	public List<Funcionario> getLista() {
		try {
			List<Funcionario> funcionarios = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();// criando o objeto
															// Contato
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));

				funcionarios.add(funcionario); // adicionando o objeto à lista

			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {

			throw new DAOException("Ocorreu um erro ao listar funcionários!");
		}
	}

	//
	public List<Funcionario> getListaId(int id) {
		try {
			List<Funcionario> funcionarios = new ArrayList<>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios where id =" + id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();// criando o objeto
															// Contato
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));

				funcionarios.add(funcionario); // adicionando o objeto à lista

			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (SQLException e) {

			throw new DAOException("Ocorreu um erro ao buscar ID!");
		}
	}

}
