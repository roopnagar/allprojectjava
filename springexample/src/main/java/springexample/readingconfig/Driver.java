package springexample.readingconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		// Here using context.getBean method we are trying to get an instance of
		Customer cust = context.getBean("customer", Customer.class);

		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getAddress().getCountry());

		Address add = context.getBean("addrBean1", Address.class);
		System.out.println(add);

		Person per = context.getBean("personBean", Person.class);
		System.out.println(per.getResidentialAddress().getState());
		System.out.println(per.getPermanentAddress().getState());

	}

}
