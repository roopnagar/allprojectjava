package springexamplewithanno1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springexamplewithanno1.models.AmarilloVisitor;
import springexamplewithanno1.models.Greeter;
import springexamplewithanno1.models.JerseyVisitor;
import springexamplewithanno1.models.PopupGreeter;
import springexamplewithanno1.models.Visitor;


@Configuration
public class AppConfig {

	@Bean(name="amarilloVisitor")
	public Visitor createVisitor() {
		return new AmarilloVisitor();
	}

	@Bean(name = "greeter")
	public Greeter createGreater() {
		return new PopupGreeter();
	}

	@Bean(name = "jerseyVisitor")
	public Visitor createJerseyVisitor() {
		return new JerseyVisitor();
	}

}
