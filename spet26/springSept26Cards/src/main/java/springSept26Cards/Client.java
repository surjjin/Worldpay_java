package springSept26Cards;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		 RewardCalculator rc=(RewardCalculator)applicationContext.getBean("rpc");
		System.out.println(rc.display());
		System.out.println(rc.rewardCalculation(10000));
	}

}
