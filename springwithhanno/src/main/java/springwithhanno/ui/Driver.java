package springwithhanno.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springwithhanno.config.AppConfig;
import springwithhanno.models.Greeter;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeter g = factory.getBean("greeter",Greeter.class);
		System.out.println("got greeter "+ g);
		g.greet();
		factory.close();
		

	}

}
