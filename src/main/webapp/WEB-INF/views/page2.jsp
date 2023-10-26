<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String userName = (String)request.getAttribute("username");
	int age = (int)request.getAttribute("age");
%>

<h1>Your name is <%=userName %></h1>
<h1>Your age is <%=age %></h1>			
			
</body>
</html>