<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询成功</title>
</head>
<body>
<% String word=(String)request.getAttribute("word");%>
<h1 style=color:blue;><%=word%></h1>
</body>
</html>