package que2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.out;

public class UserInterface {

	public void display(Collection<que2.Product> hs){
		Iterator<que2.Product> it=hs.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public static void main(String[] args) {
		
		HashSet<que2.Product> hs =new HashSet<que2.Product>();
		UserInterface obj=new UserInterface();
		
		
		for(int i=0;i<50;i++)
		hs.add(new que2.Product());
		obj.display(hs);
		
		System.out.println("--------------------------------------");
		
		TreeSet<que2.Product> ts=new TreeSet<>(hs);
		obj.display(ts);
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		
		String ch1 = null;
		while(true){
			System.out.println("enter true to enter");
			if(!sc.nextBoolean())
				break;
			out.println("enter choice search sort exit");
			ch1=sc.next();
			switch (ch1){ 
			case "search":{
				out.println("enter pcode");
				int p= sc.nextInt();
				for (que2.Product temp:hs){
					if(temp.getPcode()==p)
						System.out.println(temp);
				}
				break;
			}
			case "sort":{
				System.out.println("sorting");
				System.out.println("enter feild");
				String s= sc.next();
				if(s.equals("pcode"))
				{
					
					ArrayList<Product> al=new ArrayList<Product>();
					al.addAll(hs);
					Collections.sort(al, new Comparator<Product>() {
						@Override
						public int compare(Product o1, Product o2) {
							if(o1.getPcode()>o2.getPcode())
								return 1;
							else
								return -1;
							
						}
					});
					
					obj.display(al);
					
					
				}
				else if(s.equals("pname")){
					
					ArrayList<Product> al=new ArrayList<Product>();
					al.addAll(hs);
					Collections.sort(al, new Comparator<Product>() {
						@Override
						public int compare(Product o1, Product o2) {
							return o1.getPname().compareTo(o2.getPname());
						}
					});
					
					obj.display(al);
				}
				else if(s.equals("brand")){
					
					ArrayList<Product> al=new ArrayList<Product>();
					al.addAll(hs);
					Collections.sort(al, new Comparator<Product>() {
						@Override
						public int compare(Product o1, Product o2) {
							return o1.getBrand().compareTo(o2.getBrand());
						}
					});
					obj.display(al);
					
				}
				else if(s.equals("price")){
					
					ArrayList<Product> al=new ArrayList<Product>();
					al.addAll(hs);
					Collections.sort(al, new Comparator<Product>() {
						@Override
						public int compare(Product o1, Product o2) {
							if(o1.getPrice()>o2.getPrice())
								return 1;
							else
								return -1;
							
						}
					});
					obj.display(al);
					
					
					
				}
				else if(s.equals("quantity")){
					
					ArrayList<Product> al=new ArrayList<Product>();
					al.addAll(hs);
					Collections.sort(al, new Comparator<Product>() {
						@Override
						public int compare(Product o1, Product o2) {
							if(o1.getQuantity()>o2.getQuantity())
								return 1;
							else
								return -1;
							
						}
					});
					obj.display(al);
					
				}
			}
				break;
				
			case "exit":
				break;
			default:
				break;
			}
				
				
			
		}
	
	}

}
