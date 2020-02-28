<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<meta charset="ISO-8859-1">
<title>List pokemon</title>
</head>
<body>

	<%@ include file="partials/header.jsp"%>

	<main>
		<section class="container-fluid">
			<h2>List pokemans</h2>


			<table class="container">
				<tr>
					<th>#</th>
					<th>Name</th>
					<th>Level</th>
				</tr>

				<c:forEach var="poke" items="${pokemons}">

					<tr>
						<td>${poke.id}</td>
						<td>${poke.name}</td>
						<td>${poke.level}</td>
					</tr>
				</c:forEach>
			</table>
			<a href="/pokemon/add" class="btn btn-secondary">Create a new
				pokeman</a>



		</section>


	</main>

</body>
</html>