<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" errorPage="errpage.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<h1> flight detail</h1>
<h3> ${message}</h3>
<form action="add.do">
<table border="2">
<tr> <td> Carrier</td>
<td><input name="carrier" required pattern="[A-Za-z]{4,}"></td>
</tr>
<tr> <td> Source</td>
<td><input name="source"></td>
</tr>
<tr><td>Destination</td>
<td><input name="destination"></td>
</tr>
<tr> <td> Distance</td>
<td><input name="distance"></td>
</tr>
<tr><th colspan="2"><input type="submit" value="Add Flight"></th></tr>
</table>
</form>
</body>
</html>