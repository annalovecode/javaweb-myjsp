package com.imooc.servlet;
/**
 * @author Anna
 * @date 2020/9/9
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showSum
 */
@WebServlet("/showSum")
public class showSum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showSum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(request.getParameter("num"));
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num>100){	
				System.out.println("������1-100����ֵ");
				continue;
			}
			else 
				sum=sum+i;
		}
		//��������ó��Զ�������
		request.setAttribute("sum", sum);
		//ʵ��������ת���Ĺ���
	    request.getRequestDispatcher("/sum").forward(request,response);
	}

}
