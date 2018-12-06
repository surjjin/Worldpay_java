

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int pcode =Integer.parseInt(request.getParameter("pcode"));
		String pname = request.getParameter("pname");	
		String dsc=request.getParameter("dsc");
		int catid=Integer.parseInt(request.getParameter("catid"));
		int price=Integer.parseInt(request.getParameter("price"));
		mvcSept20.Product p=new mvcSept20.Product();
		p.setCatid(catid);
		p.setDsc(dsc);
		p.setName(pname);
		p.setPcode(pcode);
		p.setPrice(price);
		new mvcSept20.ProductService().insert(p);
		request.setAttribute("p", p);
		//response.sendRedirect("viewProduct.jsp");
		request.getRequestDispatcher("viewProduct.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
