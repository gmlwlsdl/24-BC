package myapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailServlet2
 */
@WebServlet(
		urlPatterns = { "/EmailServlet" }, 
		initParams = { 
				@WebInitParam(name = "adminEmail", value = "admin@myservice.com"), 
				@WebInitParam(name = "myEmail", value = "heejin094@kgu.ac.kr")
		})
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test init parameters<br>");
		
		ServletConfig servletConfig = getServletConfig();
		Enumeration<?> e = servletConfig.getInitParameterNames();
		while(e.hasMoreElements()) {
			out.println("param name= " + e.nextElement()+"<br>");
		}
		out.println("Admin email : "+servletConfig.getInitParameter("adminEmail"));
		out.println("<br>");
		out.println("My email : "+servletConfig.getInitParameter("myEmail"));
	}


}
