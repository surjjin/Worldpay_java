package customTag;

import java.io.IOException;
import java.util.HashSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SearchAll extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		HashSet<Product> hs = new ProductService().searchAll();
		JspWriter out=getJspContext().getOut();
		for(Product p:hs) {
			out.println("\n");
			out.println(p);
		}
	}
	
}
