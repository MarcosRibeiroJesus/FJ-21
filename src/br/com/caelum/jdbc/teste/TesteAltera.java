package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		contato.setNome("Cel");
		contato.setEmail("novocontato@celina.com.br");
		contato.setEndereco("Rua 14 Casa 14");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId(7L);
		dao.altera(contato);

		System.out.println("Cadastro alterado com sucesso! \n" + "ID: " + contato.getId() + " Nome: "+ contato.getNome());

	}
}
