package springwithhanno.models;

import org.springframework.stereotype.Component;

@Component
public class AmarilloVisitor implements Visitor {
	
	public String name;
	public String greeting;
	
	public AmarilloVisitor() {
		super();
	}

	public AmarilloVisitor(String name, String greeting) {
		super();
		System.out.println("created amillo visitor");
		this.name = "Suraj";
		this.greeting = "ram ram ji";
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
