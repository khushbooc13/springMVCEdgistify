<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<center>
<h2>Details</h2>
<form:form action="save" method="POST" enctype = "multipart/form-data">
	

	<table    border="0">
		<tr>
			<td>User Name</td>
			<td><form:input path="name" id="userName"/></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><form:input path="email" id="userEmail"/>
			</td>
			
		</tr>
		<tr>
			<td>Request Location Map</td>
			<td><form:input path="requestLoc" id="userRequestLoc"/></td>
		</tr>
		<tr>
			<td>Zone Type</td>
			<td><form:input path="zone" id="userZone"/></td>
		</tr>
		<tr>
			<td>Service Location ID</td>
			<td><form:input path="service" id="ServiceLoc"/></td>
		</tr>
		<tr>
			<td>Service Date</td>
			<td><form:input path="serviceDate" id="ServiceD"/></td>
		</tr>
		<tr>
			<td>No of Resource Required</td>
			<td><form:input path="RR" id="Resource"/></td>
		</tr>
		<tr>
			<td>Select File</td>
			<td><input type="file" path="filename" size=20/></td>
		</tr>
		 <tr>
			<td colspan="2" align="center">
			<input type="submit" value="Submit" onClick="return validate()"></td>
		 </tr>	
		 
		 <tr>
				<td colspan="2" align="center"><font color="red">${MESSAGE}</font></td>
			</tr>
		
		 
		</table>

</form:form>
</center>

</body>
</html>