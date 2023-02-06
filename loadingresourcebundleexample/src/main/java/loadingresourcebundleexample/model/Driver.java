package loadingresourcebundleexample.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-resource.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean",HelloWorld.class);
		System.out.println(helloWorld.getMessage1());
		System.out.println(helloWorld.getMessage2());

	}

}
