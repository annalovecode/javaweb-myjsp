<%@ page contentType="text/html;charset="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  服务器内部错误，请联系管理员
 <%
    String msg=exception.getMessage();
    out.println("<br>"+exception.getClass().getSimpleName()+":"+msg);
 %>
</body>
</html>