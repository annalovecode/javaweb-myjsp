package com.imooc.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class imoocIndexServlet
 */
@WebServlet("/cookies/index")
public class imoocIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public imoocIndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡcookie���ж��û��ĵ�¼״̬
		//request.getCookies()�û���ȡ���е�cookie��Ϣ
		//û������ʱ��ʱ����ǰcookie����Ч���ǽ��ڴ�������д���
		Cookie[] cs=request.getCookies();
		if(cs==null)
		{	System.out.println("user not login");
		    return;}
		String user=null;
		for(Cookie c:cs)
		{
			System.out.println(c.getName()+":"+c.getValue());
			if(c.getName().equals("user")) {
				user=c.getValue();
				break;
			}
		}
		if(user==null)
		{
			response.getWriter().println("user not login");
		}
		else {
			response.getWriter().println("user"+user);
		}
	}

}
