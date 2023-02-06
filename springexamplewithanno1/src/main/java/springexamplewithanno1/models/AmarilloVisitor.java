package springexamplewithanno1.models;

import org.springframework.stereotype.Component;

@Component
public class AmarilloVisitor implements Visitor {

	public String name;
	public String greeting;

	

	public AmarilloVisitor() {
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

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getGreeting() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
