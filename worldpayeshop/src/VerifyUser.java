

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import worldpayeshop.UserService;

/**
 * Servlet implementation class VerifyUser
 */
@WebServlet("/VerifyUser")
public class VerifyUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerifyUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String remember="false";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String utype=request.getParameter("utype");
	    
	    
		
		if(utype.equals("Admin")) {
			if(username.equals("admin")&&password.equals("admin"))
				{
					
				if(request.getParameterMap().containsKey("remember")) {
						Cookie c1=new Cookie("username", username);
						c1.setMaxAge(6000);
						Cookie c2=new Cookie("password", password);
						c2.setMaxAge(6000);
						response.addCookie(c1);
						response.addCookie(c2);
					}
					HttpSession session = request.getSession();
					session.setAttribute("name", "admin");
					response.sendRedirect("adminpage.jsp");
				}
			else
				response.sendRedirect("index.jsp");
		}
		else {
			String name = new UserService().searchUser(username, password);
			if(name!=null) {
				
				if(request.getParameterMap().containsKey("remember")){
					Cookie c1=new Cookie("username", username);
					c1.setMaxAge(6000);
					Cookie c2=new Cookie("password", password);
					c2.setMaxAge(6000);
					response.addCookie(c1);
					response.addCookie(c2);
				}
				HttpSession session = request.getSession();
				session.setAttribute("name", name);
				session.setAttribute("username", username);
				response.sendRedirect("buyerpage.jsp");
			}
				
			else
				response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
