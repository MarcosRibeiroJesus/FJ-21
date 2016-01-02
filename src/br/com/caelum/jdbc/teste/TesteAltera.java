package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		contato.setNome("Cel");
		//contato.setEmail("novocontato@celina.com.br");
		//contato.setEndereco("Rua 14 Casa 14");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(7);
		dao.altera(contato);

		System.out.println("Cadastro alterado com sucesso! " + contato.getNome());
		List<Contato> contatos = dao.getLista();

		for (Contato contato1 : contatos) {
			System.out.println("ID: " + contato1.getId());
			System.out.println("Nome: " + contato1.getNome());
		}
	}
}
