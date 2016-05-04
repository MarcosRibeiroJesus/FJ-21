<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	<!-- Cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />

	<table>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${dao.lista }" varStatus="id"> 
			<tr bgcolor="#${id.count % 2 == 0 ? 'aaee88' : 'ffffff' }">
			<td>${id.count}</td>
				<td><%String nome = "NOME: ";%><% out.println(nome); %>${contato.nome }</td>
				<td><%String email = " | E-MAIL: ";%><% out.println(email); %>${contato.email }</td>
				<td><%String endereco = " | ENDEREÇO: ";%><% out.println(endereco); %>${contato.endereco }</td>
				<td><%String data = " | DATA DE NASCIMENTO: ";%><% out.println(data); %>${contato.dataNascimento.time }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>