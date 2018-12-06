package springSept27QueOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
	}

}
