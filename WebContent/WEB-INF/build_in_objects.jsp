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
    String url= request.getRequestURL().toString();//HttpServletRequest
    response.getWriter().println(url);//本质就是httpserviceresponse
  %>
  <% out.println("<br>ABCCC");
     session.setAttribute("user","zhangsan");
     out.println((String)session.getAttribute("user")); 
  %>
  <%
     String cp=application.getInitParameter("copyright");//srvletContext
     out.println("<hr/>");
     out.println(cp);
     pageContext.getRequest();
     pageContext.getResponse();
     pageContext.getSession();
     pageContext.getServletContext();
  %>
</body>
</html>