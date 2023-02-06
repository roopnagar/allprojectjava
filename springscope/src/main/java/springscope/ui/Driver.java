package springscope.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springscope.bean.CustomerService;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		CustomerService cust = context.getBean("customerService",CustomerService.class);
		CustomerService cust1 = context.getBean("customerService",CustomerService.class);
		cust.setMessage("yo yo");
		
		
		
		System.out.println(cust.getMessage());
		System.out.println(cust1.getMessage());
		
		CustomerService cust2 = context.getBean("customerSer",CustomerService.class);
		CustomerService cust3 = context.getBean("customerSer",CustomerService.class);
		cust2.setMessage("yo yo honey");
		
		
		
		System.out.println(cust2.getMessage());
		System.out.println(cust3.getMessage());

		

	}

}
