package hibernateDayOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Address ad1=new Address(46,"Kanadia Road","indore");
		Address ad2=new Address(12,"Vijay Nagar","delhi");
		e1.setAddress(ad1);
		e1.setEname("suraj");
		e1.setEmpno(102);
		e1.setSalary(35000);
		Employee e2=new Employee();
		e2.setAddress(ad2);
		e2.setEname("abhinav");
		e2.setEmpno(103);
		e2.setSalary(35500);
		Laptop l1=new Laptop(201,"apple",102000);
		Laptop l2=new Laptop(202,"lenovo",98000);
//		e1.getLaptop().add(l1);
//		e1.getLaptop().add(l2);
//		e2.getLaptop().add(l1);
		e1.getLaptop().add(l1);
		e1.getLaptop().add(l2);
		e2.getLaptop().add(l1);
		Session session = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
		//System.out.println(session);
		
		Transaction transaction = session.beginTransaction();
//		session.save(ad1);
//		session.save(ad2);
		session.save(l1);
		session.save(l2);
		session.save(e1);
		session.save(e2);
		
		transaction.commit();
		session.close();
		
	}

}
