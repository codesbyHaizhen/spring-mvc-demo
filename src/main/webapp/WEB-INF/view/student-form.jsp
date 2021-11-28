<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title> Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
		
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Favorite Language:
			Java <form:radiobutton path="favoriteLanguage" value="Java" />
			C# <form:radiobutton path="favoriteLanguage" value="C#" />
			PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
			RUBY <form:radiobutton path="favoriteLanguage" value="RUBY" />
		
		<br><br>
		
		Country: 
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
					
			</form:select>
			
		<br><br>
		
		Operating Systems:
			Linux<form:checkbox path="operatingSystems" value="Linux" />	
			Mac Os<form:checkbox path="operatingSystems" value="Mac Os" />
			MS Windows<form:checkbox path="operatingSystems" value="MS Windows" />
			
		<br><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>
</html>