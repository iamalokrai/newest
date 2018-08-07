<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String gender=request.getParameter("gender");
String hq=request.getParameter("qualification");
String dob=request.getParameter("dob");
String email=request.getParameter("email");
%>
<h1><marquee>Resume</marquee></h1><br>
<hr>
Name: <%=fname %>
<%=lname %>
<br>
Gender:<%=gender %><br>
Highest Qualification: <%=hq %><br>
Date of Birth: <%=dob %><br>

</body>
</html>