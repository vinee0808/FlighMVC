<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"
errorPage="errpage.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<form action="find.do">
Enter flight: <input name="id" required pattern=""><input type="submit" value="Search">
</form>
<hr>

Carrier: ${flight.carrier}<br>
Source: ${flight.source}<br>
Destination: ${flight.destination}<br>
Distance: ${flight.distance}
</body>
</html>