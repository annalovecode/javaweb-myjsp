<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用列表来输出数据</title>
</head>
<body>
<%@page import="java.util.List,java.util.ArrayList" %>
<%
   List<String> messages=new ArrayList();
   messages.add("JSP基础入门");
   messages.add("Servlet视频详解");
   messages.add("EL表达式初识");
   messages.add("JSTL标签库初识");
%>
  <% for(int i=0;i<messages.size();i++){ %>
      <p>第<%=i+1 %>条:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=messages.get(i) %> </p>
  <% } %>
</body>
</html>