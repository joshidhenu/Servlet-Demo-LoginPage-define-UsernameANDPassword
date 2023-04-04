

import java.io.IOException;
import java.io.PrintWriter;

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
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		    PrintWriter pw = response.getWriter();  
		String userName=request.getParameter("userName");
		String userPass=request.getParameter("userPass");
		
		if (userName.equals("admin") && userPass.equals("123")){
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");  
	        rd.forward(request, response);  
	    
		}
		else
		{
			pw.println("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/IndexLogin.html");  
	        rd.include(request, response);  
		}
	}

}
