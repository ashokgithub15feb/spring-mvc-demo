<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

	<h1>Student Registration Form </h1>
	
	<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName" />
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		<br><br>
		
		<br><br>
		
		Country: 
		
		<form:select path="country">
			
			<form:option value="--" label="--" />
			<form:options items="${student.countryOptions}" />

		</form:select>
		
		<br><br>
	
		Favorite Language:
		
		Java <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions }" />		
	
		<br><br>
	
		Operating System:
		
		Linux <form:checkbox path="operationSystems" value="Linux"/>
		MS Windows <form:checkbox path="operationSystems" value="MS Windows"/>
		Mac OS<form:checkbox path="operationSystems" value="Mac OS"/>

		<br><br>

		<input type="submit" value="Submit" />
		
		
	</form:form>
</body>
</html>