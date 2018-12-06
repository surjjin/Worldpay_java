package organization;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddProduct {
	
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Product p1=new Product(102,"iphone",45500,"apple");
		Product p2=new Product(112,"pixcel",55000,"google");
		Transaction transaction = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		transaction.commit();
		session.close();
	}
	
	
	
}
