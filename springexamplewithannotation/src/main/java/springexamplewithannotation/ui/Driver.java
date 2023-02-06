package springexamplewithannotation.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexamplewithannotation.models.Address;
import springexamplewithannotation.models.Customer;

public class Driver {

	public static void main(String[] args) {
		String springConfigurationFile = "springconfig-annotations.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		Customer cust = context.getBean("customer",Customer.class);
		System.out.println("got customer "+ cust.getCustomerName());
		cust.setCustomerName("Roop");
		System.out.println("got customer "+ cust.getCustomerName());
		Address add = context.getBean("addressBean1",Address.class);
		System.out.println("got address"+add.getCity());
        add.setCity("greater noida");
        System.out.println("got address "+add.getCity()); 
	}

}
