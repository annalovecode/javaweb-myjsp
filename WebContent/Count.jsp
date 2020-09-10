<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>count from 1-100</title>
</head>
<body>
    <% int i=0;
       int sum=0;
       for (i=1; i<=100; i++)
        {
    	   sum=sum+i;
        }
     %>
     <%= "sum="+sum %>
</body>
</html>