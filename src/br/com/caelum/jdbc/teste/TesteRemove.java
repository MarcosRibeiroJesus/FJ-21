package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.*;
import br.com.caelum.jdbc.modelo.Contato;

/**
 * Classe para teste de remoção
 * 
 * @author marcos
 *
 */
public class TesteRemove {

	public static void main(String[] args) {

		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();

		contato.setId(5);// setando a id a ser apagada

		dao.remove(contato);

		System.out.println("Cadastro removido com sucesso!");

	}

}
