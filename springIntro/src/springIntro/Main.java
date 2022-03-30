package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService= context.getBean("service",CustomerService.class);
		customerService.add();
	}

	//IoC - Inversion of control
	//Dependency Injectýon
}
