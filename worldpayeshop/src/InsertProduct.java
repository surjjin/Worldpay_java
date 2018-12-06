

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import worldpayeshop.Product;
import worldpayeshop.ProductService;

/**
 * Servlet implementation class InsertProduct
 */
@WebServlet("/InsertProduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int pcode =Integer.parseInt(request.getParameter("pcode"));
		String pname = request.getParameter("pname");	
		String dsc=request.getParameter("dsc");
		int catid=Integer.parseInt(request.getParameter("catid"));
		int price=Integer.parseInt(request.getParameter("price"));
		Product p=new Product();
		p.setCatid(catid);
		p.setDsc(dsc);
		p.setName(pname);
		p.setPcode(pcode);
		p.setPrice(price);
		new ProductService().insert(p);
		response.sendRedirect("adminpage.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
