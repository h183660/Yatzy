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
<title>SpillerListe</title>
</head>
<body>
	<h2>Spillerliste</h2>
	<table class="pure-table">
		<tr bgcolor="#cccccc">
			<th align="left">Brukernavn</th>
			<th align="left">Navn</th>
			<th align="left">Epost</th>
		</tr>
		
		<c:forEach items="${spillere}" var="s">
		<c:choose>
		<c:when test="${spiller.brukernavn eq s.brukernavn}">
			<tr bgcolor="#aaffaa">
		</c:when>
		<c:otherwise>
		<tr bgcolor="#ffffff">
		</c:otherwise>
		</c:choose>
		
		<td>${s.brukernavn}</td>
		<td>${s.navn}</td>
		<td>${s.epost}</td>		
		
		</c:forEach>
	</table>
</body>
</html>