package sept7;

import java.util.Random;

public class Product {
	private int pcode;
	private String pname;
	private String brand;
	private int price;
	private int quantity;
	
	Random rand = new Random();
	
	public Product() {
		fill();
	}
	
	public void fill(){
		String b[]= {"addidas","nike","puma"};
		pcode=rand.nextInt(999)+100;
		pname= String.valueOf(rand.nextInt(100000)+10000);
		brand=b[rand.nextInt(2)+0];
		price=rand.nextInt(100)+10;
		quantity=rand.nextInt(20)+1;
	}

	@Override
	public boolean equals(Object obj) {
	Product p=(Product)obj;
		if(pcode==p.pcode)
			return true;
		else
			return false;
			
			
		
	}

	@Override
	public int hashCode() {
		return pcode;
		
	}

	@Override
	public String toString() {
		return pcode+"\t"+pname+"\t"+brand+"\t"+price+"\t"+quantity;
	}
	
	
	
	
}
