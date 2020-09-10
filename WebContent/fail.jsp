<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>fail to find</title>
</head>
<body>
<%      HttpSession fail=request.getSession();%>
<% 		String word=(String)session.getAttribute("word"); %>
<h1 style=color:blue;><%=word%></h1>
</body>
</html>