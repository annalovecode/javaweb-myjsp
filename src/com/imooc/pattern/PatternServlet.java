package com.imooc.pattern;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatternServlet
 */
@WebServlet({"/pattern/*","/PatternServlet/*"})
public class PatternServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ѯԱ���Ļ�����Ϣ
		//��ȡ��ǰ���ʵ�url
		String url=request.getRequestURL().toString();
		System.out.println(url);
		String id=url.substring(url.lastIndexOf("/")+1);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println(id);
		if(id.equals("1")) {
			out.println("����");
		}else if(id.equals("2"))
		{
			out.println("����");
		}
		else {
			out.println("����Ա��");
		}
	}
   
}
