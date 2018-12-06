package springSept27QueFour;

import java.util.HashSet;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallingEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		for(String a :employee.getEmails()) {
			System.out.println(a);
		}
		for(Mobile m:employee.getMobiles()) {
			System.out.print(m.getMbno()+"\t");
			System.out.print(m.serviceProvider+"\t");
			System.out.print(m.getCtrcode()+"\n");
		}
		Map<String, Info> family = employee.getFamily();
		Info info = family.get("me");
		System.out.println(info);
		Info info1 = family.get("father");
		System.out.println(info1);
		Info info2 = family.get("brother");
		System.out.println(info2);
	}

}
