package customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SearchProduct extends SimpleTagSupport{

	private int pcode;
	
	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	
	public SearchProduct() {
		super();
	}

	public SearchProduct(int pcode) {
		super();
		this.pcode = pcode;
	}

	@Override
	public void doTag() throws JspException, IOException {
		Product p = new ProductService().searchPcode(pcode);
		System.out.println(p);
		JspWriter out=getJspContext().getOut();
		out.println("PCode "+p.getPcode());
		out.println("Pname "+p.getName());
		out.println("DSC "+p.getDsc());
		out.println("Price "+p.getPrice());
		
	}
	
}
