package com.imooc.hashmap;
/**
 * @author Anna
 * @date 2020/9/9
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Query
 */
@WebServlet({ "/Query/*","/Myjsp/Query/*" })
public class Query extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String>wordsMap=new HashMap<String,String>();
		//�������
		wordsMap.put("apple","ƻ��");
		wordsMap.put("pear","����");
		wordsMap.put("banana","�㽶");
		String word=request.getParameter("word");
		if(wordsMap.containsKey(word)) {
			request.setAttribute("word", wordsMap.get(word));
			request.getRequestDispatcher("/success.jsp").forward(request, response);
		}
		else {
			HttpSession session= request.getSession();
		    session.setAttribute("fail", "δ�ҵ���Ӧ�ĵ��ʽ���");
			response.sendRedirect("/fail.jsp");
		}
	
	}
}
