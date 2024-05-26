import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		
		List<Student> studs = Arrays.asList(new Student(1201, "Aastha"),new Student(1203, "Aishwarya"), new Student(1205, "Akhil"));
//		Student s = new Student(1269, "Bhavana");
		req.setAttribute("students", studs);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
	}
}
