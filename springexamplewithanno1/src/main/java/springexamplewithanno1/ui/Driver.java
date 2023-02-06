package springexamplewithanno1.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springexamplewithanno1.config.AppConfig;
import springexamplewithanno1.models.Greeter;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Greeter g = factory.getBean(Greeter.class);
		System.out.println("got greeter"+g);
		g.greet();
		factory.close();

	}

}
