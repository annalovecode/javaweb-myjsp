<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>news</title>
</head>
<body>
<%@include file="include/header.jsp" %>
<% 
   out.println("<h1>新闻标题</h1>");
   out.println("<p>新闻正文</p>");
%>
<br>
<%@include file="include/footer.jsp" %>
Copyright 1999-2018
</body>
</html>