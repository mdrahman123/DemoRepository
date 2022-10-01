<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Flight Search Result</h2>
<tr>
	<td>${findFlights.operatingAirlines }</td>
	<td>${findFlights.departureCity }</td>
	<td>${findFlights.arrivalCity }</td>
	<td>${findFlights.estimatedDepartureTime }</td>
	
</tr>

</body>
</html>