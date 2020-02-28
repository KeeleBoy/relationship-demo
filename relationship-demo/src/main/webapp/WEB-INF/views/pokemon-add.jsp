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
<title>Add pokemon</title>
</head>
<body>

	<%@ include file="partials/header.jsp"%>

	<main>
		<section class="jumbotron">
			<h2>Create pokeman</h2>

			<section class="container">
				<form method="post">
					<label>Name</label> <input type="text" required name="name">
					<label>Level</label> <input type="number" required name="level">

					<div>
						<select name="trainer">
							<c:forEach var="trainer" items="${trainers}">

								<option value="${trainer.id}">${trainer.username}</option>

							</c:forEach>

						</select>
					</div>
					<button type="submit" class="btn btn-warning">Create</button>
				</form>

				<a href="/pokemon/">Cancel</a>


			</section>


		</section>


	</main>


</body>
</html>