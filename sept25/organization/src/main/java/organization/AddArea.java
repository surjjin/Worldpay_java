package organization;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddArea {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Area a1=new Area(102,"indore","mp");
		Transaction transaction = session.beginTransaction();
		session.save(a1);
		transaction.commit();
		session.close();
		

	}

}
