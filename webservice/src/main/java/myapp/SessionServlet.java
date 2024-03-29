package myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
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
		out.println("<HTML><BODY>");
		out.println("Session test<br>");
		
		HttpSession session = request.getSession();
		if(session.isNew()) {
			out.println("This is a new session.");
			session.setMaxInactiveInterval(30);
		}
		else {
			out.println("<br>created time = " + session.getCreationTime());
			out.println("<br>last acessed time = " + session.getLastAccessedTime());
			out.println("<br>maximum inactive interval = " + session.getMaxInactiveInterval());
		}
		out.println("</BODY></HTML>");
	}

}
