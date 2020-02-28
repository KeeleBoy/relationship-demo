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
<title>Insert title here</title>
</head>
<body>

	<%@ include file="partials/header.jsp"%>

	<main>
		<section class="jumbotron">
			<h2>WELCOME TRAINERS</h2>



		</section>
		<section class="container">
			<table class="container">
				<tr>
					<th>#</th>
					<th>Name</th>
				</tr>

				<c:forEach var="train" items="${ trainers }">
					<tr>
						<td><a href="/trainer/${train.id}">${train.id}</a></td>
						<td>${train.username}</td>
					</tr>
				</c:forEach>

			</table>

			<a href="/trainer/add" class="btn btn-secondary">Create account</a>

		</section>


	</main>

</body>
</html>