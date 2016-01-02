package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.*;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteRemove {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato1 = new Contato();
		ContatoDao dao1 = new ContatoDao();
		// setando a id a ser apagada
		contato1.setId(5);
		// removendo
		dao1.remove(contato1);

		System.out.println("Cadastro removido com sucesso! " + "Agora o id " + contato1.getId() + " está vazio.");
		
	}

}
