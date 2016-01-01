package br.com.caelum.jdbc.teste;

import java.util.Calendar;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteInsere {

	public static void main(String[] args) {

		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Celina");

		contato.setEmail("contato@celina.com.br");
		contato.setEndereco("Rua 12 Casa 12");
		contato.setDataNascimento(Calendar.getInstance());

		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();

		// método elegante
		dao.adiciona(contato);

		System.out.println("Gravado novo cadastro: " + contato.getNome());

	}
}
