<%@page import="com.banking.beans.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Customer customer = (Customer) request.getAttribute("customer"); %>
<h1>A/C No. = <%=customer.getAccountNumber() %></h1>
<h1>Name = <%=customer.getName() %></h1>
<h1>Age = <%=customer.getAge() %></h1>
<h1>Balance = <%=customer.getBalance() %></h1>




</body>
</html>