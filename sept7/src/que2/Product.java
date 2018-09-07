package que2;

import java.util.Random;

public class Product implements Comparable<Product>{
	private int pcode;
	private String pname;
	private String brand;
	private int price;
	private int quantity;
	
	Random rand = new Random();
	
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Random getRand() {
		return rand;
	}
	public void setRand(Random rand) {
		this.rand = rand;
	}
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
	@Override
	public int compareTo(Product o) {
		if(pcode>o.pcode)
			return 1;
		else
			return -1;
		
	}
	
	
}
