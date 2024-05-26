package com.basics;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/context-config-demo")
public class ContextConfigDemo extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str);
		String phn = ctx.getInitParameter("phone");
		out.println(phn);
	}
}
