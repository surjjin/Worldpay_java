package springSept27QueThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallingConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Connect con = (Connect) context.getBean("connect");
		System.out.println(con.getCon());
	}

}
