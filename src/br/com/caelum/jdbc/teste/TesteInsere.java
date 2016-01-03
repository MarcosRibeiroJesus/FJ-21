package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.jdbc.modelo.Funcionario;;

public class TesteInsere {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Paula");
		funcionario.setUsuario("p");
		funcionario.setSenha("123456");

		FuncionarioDao dao = new FuncionarioDao();
		dao.adiciona(funcionario);

		Funcionario funcionario2 = new Funcionario();

		funcionario2.setNome("Márcia");
		funcionario2.setUsuario("m");
		funcionario2.setSenha("123456");

		FuncionarioDao dao2 = new FuncionarioDao();
		dao2.adiciona(funcionario2);

		Funcionario funcionario3 = new Funcionario();

		funcionario3.setNome("Suellen");
		funcionario3.setUsuario("s");
		funcionario3.setSenha("123456");

		FuncionarioDao dao3 = new FuncionarioDao();
		dao3.adiciona(funcionario3);

		Funcionario funcionario4 = new Funcionario();

		funcionario4.setNome("Ana");
		funcionario4.setUsuario("a");
		funcionario4.setSenha("123456");

		FuncionarioDao dao4 = new FuncionarioDao();
		dao4.adiciona(funcionario4);

		System.out.println("Gravado novo cadastro: " + funcionario.getNome() + "\n" 
													+ funcionario2.getNome() + "\n");

		/*
		 * // pronto para gravar Contato contato = new Contato();
		 * contato.setNome("Koopsta"); contato.setEmail("Knicka@gmail.com.br");
		 * contato.setEndereco("Rua 88 Casa 88");
		 * contato.setDataNascimento(Calendar.getInstance());
		 * 
		 * // grave nessa conexão!!! ContatoDao dao = new ContatoDao();
		 * 
		 * // método elegante dao.adiciona(contato);
		 * 
		 * System.out.println("Gravado novo cadastro: " + contato.getNome());
		 */
	}
}
