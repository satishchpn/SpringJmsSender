<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body>
	<div>
		<center><h1>Sending Data To JMS</h1></center>
	</div>
	<h1 align="center">${msg}</h1>
	<form action="${pageContext.request.contextPath}/send">
		<table align="center">
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Message :</td>
				<td><input type="text" name="message"></td>
			</tr>
		</table>
		<center>
			<input type="submit" value="SEND">
		</center>
	</form>
</body>
</html>