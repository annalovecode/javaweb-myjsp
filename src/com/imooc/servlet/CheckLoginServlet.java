package com.imooc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLoginServlet
 */
@WebServlet({ "/CheckLoginServlet", "/CLS" })
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("�û���¼�ɹ�");
		request.setAttribute("username", "admin");
//		//ʵ��������ת���Ĺ���
	    request.getRequestDispatcher("/index").forward(request,response);
//		response.sendRedirect("Myjsp/index");
		//�����ض�����Ҫ����contextPath(������·��)�������һ�δ�����֮�����·��͸�index.servlet
	}

}
