<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation Page</title>
</head>
<body>
	<h1>Customer Confirmation</h1>
	
	<br><br>
	
	The Customer is Confirmed: ${customer.firstName } ${customer.lastName }	
	
	<br><br>
	
	Free Passes: ${customer.freePasses }
	
	<br><br>
	
	Postal Code: ${customer.postalCode }
	
	<br><br>
	
	Course Code: ${customer.courseCode }
	
</body>
</html>