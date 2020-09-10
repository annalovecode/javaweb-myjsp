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
   int y = 0;
   int x = -5;
   String compare0 = "";
   if(x<0){   
	   compare0= "x < 0";
	   y=-1;
   }
   else if(x==0){
	   compare0="x = 0";
       y=0;
   }
   else if (x > 0) {
	   compare0="x > 0";
       y = 1;
	}
	
%>

<div style="text-align: center">
    当<%=compare0%>时，输出<br>
    x=<%=x%><br>
    y=<%=y%>
</div>
</body>
</html>