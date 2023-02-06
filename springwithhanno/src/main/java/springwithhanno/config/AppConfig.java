package springwithhanno.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springwithhanno.models.AmarilloVisitor;
import springwithhanno.models.Greeter;
import springwithhanno.models.JerseyVisitor;
import springwithhanno.models.PopupGreeter;
import springwithhanno.models.Visitor;
@Configuration
public class AppConfig {
	
	@Bean
	public Visitor createVisitor() {
		return new AmarilloVisitor();
	}

	@Bean(name="greeter")
	public Greeter createGreater() {
		return new PopupGreeter();
	}
	
	@Bean(name="jerseyVisitor")
	public Visitor createJerseyVisitor() {
		return new JerseyVisitor();
	}
	
}
