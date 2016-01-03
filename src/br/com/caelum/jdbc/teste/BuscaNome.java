package br.com.caelum.jdbc.teste;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class BuscaNome {// Não Funciona
	public static void main(String[] args) {
		
		//Não funciona
		ContatoDao dao = new ContatoDao();

		String busca = "M";
		List<Contato> contatos = dao.getListaNome(busca);
		
			
		for (Contato contato : contatos) {
			  System.out.println("ID: " + contato.getId());
			  System.out.println("Nome: " + contato.getNome());
			  System.out.println("Email: " + contato.getEmail());
			  System.out.println("Endereço: " + contato.getEndereco());
			  System.out.println("Data de Nascimento: " + 
			              contato.getDataNascimento().getTime() + "\n");
			}
		
	 }

}
