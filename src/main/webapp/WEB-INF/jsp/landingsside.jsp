<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
	href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Yatzy</title>
</head>
<body>
	<h1>Yatzy</h1>
	<h2>
		<a href="LagSpillServlet">Lag Nytt Spill</a>
	</h2>

	<c:forEach items="${spillene}" var="s">
		<c:choose>
			<c:when test="${s.antall lt 6}">
				<td>${s.brukernavn}</td>
				<td>${s.navn}</td>
				<td>${s.epost}</td>
				<td>Bli Med</td>
			</c:when>
		</c:choose>
	</c:forEach>
</body>
</html>