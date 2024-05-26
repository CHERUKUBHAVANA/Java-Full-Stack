package com.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
//		int k = (int)req.getAttribute("k");
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("k");
		int k = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}
		k = k*k;
		out.println("Square is : "+k);
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		ServletConfig cfg = getServletConfig();
		String str1 = cfg.getInitParameter("name");
		out.println(str1); 
	}
}
