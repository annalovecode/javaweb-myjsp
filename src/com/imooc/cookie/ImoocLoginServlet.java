package com.imooc.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImoocLoginServlet
 */
@WebServlet({ "/cookies/Login" })
public class ImoocLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImoocLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("用户登录成功");
		//七天内用户自动登录
		Cookie cookie=new Cookie("user","admin");
		cookie.setMaxAge(60*60*24*7);
		response.addCookie(cookie);
		//在客户端浏览器中创建一个名为cookie，值为admin的变量
		response.getWriter().println("login success");
		
	}

}
