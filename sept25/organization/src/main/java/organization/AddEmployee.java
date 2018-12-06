package organization;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import static java.lang.System.out;
import javax.persistence.criteria.*;
import java.util.List;


public class AddEmployee {

	public static void display(Employee employee) {
		out.println("Eno "+employee.getEno());
		out.println("fname "+employee.getName().getFname());
		out.println("fname "+employee.getName().getMname());
		out.println("fname "+employee.getName().getLname());
		out.println("Address "+employee.getAddress());
		out.println("branch "+employee.getBranch());
		List<Area> area = employee.getArea();
		for(Area a:area) {
			out.println(a);
		}
		List<Product> product = employee.getProduct();
		for(Product p:product) {
			out.println(p.getPname());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Area a1=new Area(103,"indore","mp");
		Area a2=new Area(104,"delhi","delhi");
		Area a3=new Area(105,"bombay","Maharastra");
		Branch b1=new Branch(501,"indore");
		
		Product p1=new Product(103,"iphone",45500,"apple");
		Product p2=new Product(113,"pixcel",55000,"google");
		Name n1=new Name("suraj", "god", "jain");
		Name n2=new Name("ram", "gopal", "verma");
		Address ad1=new Address(46,"Kanadia Road","indore");
		Address ad2=new Address(12,"Vijay Nagar","delhi");
		b1.setAddress(ad1);
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setAddress(ad1);
		e1.setName(n1);
		e1.setEno(100);
		e1.setBranch(b1);
		e1.getArea().add(a1);
		e1.getArea().add(a2);
		e1.getProduct().add(p1);
		e1.getProduct().add(p2);
		
		e2.setAddress(ad2);
		e2.setName(n2);
		e2.setEno(101);
		e2.setBranch(b1);
		e2.getArea().add(a3);
		e2.getProduct().add(p1);
		e2.getProduct().add(p2);
		Transaction transaction = session.beginTransaction();
		session.save(b1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(e2);
		transaction.commit();
		//read the data;
		Employee employee = session.get(Employee.class, 100);
		display(employee);
		
		session.close();
		
		
		
	}

}
