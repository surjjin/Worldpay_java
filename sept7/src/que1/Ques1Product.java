package sept7;
import static java.lang.System.out; 
import java.util.HashSet;

public class Ques1Product {
	public static void main(String args[]){
		HashSet<Product> hs =new HashSet<Product>();
		for(int i=0;i<25;i++)
			hs.add(new Product());
	
		/*	String fullClassName = new Scanner(System.in).next(); //Read from standard input
			Class<?> clazz = Class.forName(fullClassName);
			Object instance = clazz.newInstance();*/
		
	for(Product s:hs){
		out.println(s);
	}
	Product p=new Product();
	double starttime=System.nanoTime();
	boolean bs=hs.contains(p);
	double enddate=System.nanoTime();
	out.println(bs);
	out.println(starttime+"\t"+enddate+"\t "+(enddate-starttime));
	
	
	
	
}
}
