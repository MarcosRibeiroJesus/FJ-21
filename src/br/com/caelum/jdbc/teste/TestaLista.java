package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

/**
 * Exercício 2.13.2
 * 
 * @author Marcos
 *
 */
public class TestaLista {
	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("ID: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());

			SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
			String dataNascimento = spf.format(contato.getDataNascimento().getTime());
			System.out.println("Datas Nascimento:" + dataNascimento + "\n");
		}

	}

}
