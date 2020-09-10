package com.imooc.charset;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CharsetServlet
 */
@WebServlet("/charset/process")
public class CharsetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharsetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		对于tomcat8.x版本，默认get请求发送中文就是utf-8的格式，所以无需转换。
		String ename=request.getParameter("ename");
		String address=request.getParameter("address");
		System.out.println(ename+":"+address);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(ename+":"+address);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //request.setCharacterEncoding方法用于将请求体重的字符集转换为utf-8，写在第一行，只能用在post请求体中
		request.setCharacterEncoding("UTF-8");
		String ename=request.getParameter("ename");
		String address=request.getParameter("address");
		//解决中文乱码的方法
//		String utf8Ename=new String(ename.getBytes("iso-8859-1"),"utf-8");
//		String utf8Address=new String(address.getBytes("iso-8859-1"),"utf-8");
//		System.out.println(utf8Ename+":"+utf8Address);
	}

}
