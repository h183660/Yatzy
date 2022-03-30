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
<title>Logg inn</title>
</head>
<body>
	<h2>Logg inn</h2>
	<p>Det er kun registrerte spillere som f�r spille yatzy.</p>
	<p>
		<c:if test="${feilmelding != null}">
			<font color="red">Ugyldig brukernavn og/eller passord</font>
		</c:if>
		<c:if test="${unauthorized != null}">
			<font color="red">Vennligst logg inn for � spille</font>
		</c:if>
		<c:if test="${finnesAllerede != null}">
			<font color="red">Brukernavnet finnes fra f�r. Fors�k gjerne �
				logge inn her.</font>
		</c:if>
	</p>
	<form method="post" class="pure-form pure-form-aligned">
		<fieldset>
			<div class="pure-control-group">
				<label for="brukernavn">Brukernavn:</label> <input type="text"
					name="brukernavn" required />
			</div>
			<div class="pure-control-group">
				<label for="passord">Passord:</label> <input type="password"
					name="passord" required />
			</div>
			<div class="pure-controls">
				<button type="submit" class="pure-button pure-button-primary">Logg
					inn</button>
			</div>
		</fieldset>
	</form>

</body>
</html>