package springSept27QueTwo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpCalling {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);
	}
}
