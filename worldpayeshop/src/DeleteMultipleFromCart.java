

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
 * Servlet implementation class DeleteMultipleFromCart
 */
@WebServlet("/DeleteMultipleFromCart")
public class DeleteMultipleFromCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMultipleFromCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
			String s[]=request.getParameterValues("pid");
			System.out.println(s.length);
			HttpSession session = request.getSession();
			HashSet<Product> hs=null;
			for(String temp:s) {
				//out.write(Integer.parseInt(temp)+"");
				int pcode=Integer.parseInt(temp);
				System.out.println(pcode);
				
				hs=(HashSet<Product>) session.getAttribute("cart");
				hs.remove(new ProductService().searchPcode(pcode));
//				for(Product p:hs) {
//					if(p.getPcode()==pcode)
//					{
//						hs.remove(p);
//						System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% "+pcode);
//					}
//					
//				}

			}
			session.setAttribute("cart", hs);
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
