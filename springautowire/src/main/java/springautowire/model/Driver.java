package springautowire.model;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Employee emp = (Employee) context.getBean("employee",Employee.class);
		
		
		System.out.println(emp.getAddress());

	}

}
