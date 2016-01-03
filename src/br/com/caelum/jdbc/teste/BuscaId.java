package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class BuscaId {
	public static void main(String[] args) {

		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getListaId(1);

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