

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import worldpayeshop.Product;
import worldpayeshop.ProductService;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		//out.write(Integer.parseInt(request.getParameter("pid"))+"");
		int pid=Integer.parseInt(request.getParameter("pid"));
			
		Product p=new ProductService().searchPcode(pid);
		//hs.add(p);
		System.out.println(p);
		
		
		
		HttpSession session = request.getSession();
		HashSet<Product> hs1=(HashSet<Product>) session.getAttribute("cart");
		if(hs1==null)
		{
			HashSet<Product> hs=new HashSet<>();
			session.setAttribute("cart", hs);
		}
		else
		{
			hs1.add(p);
			session.setAttribute("cart", hs1);
		}
		
		response.sendRedirect("displaycart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
