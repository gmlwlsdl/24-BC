package myapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginManager loginMgr = new LoginManager();
		UserBean userBean = new UserBean();
		String addr;
		
		userBean.setUserid(request.getParameter("userid"));
		userBean.setPasswd(request.getParameter("passwd"));
		if(loginMgr.authenticate(userBean)) 
			addr = "/ch07/login_success.jsp";
		else
			addr = "/ch07/login_fail.jsp";
		
		request.setAttribute("userinfo", userBean);
		RequestDispatcher dispatcher = request.getRequestDispatcher(addr);
		dispatcher.forward(request, response);
	}

}
