package springwithhanno.models;

import org.springframework.stereotype.Component;

@Component
public class JerseyVisitor implements Visitor {
	
	public String name;
	public String greeting;
	
	

	public JerseyVisitor() {
		super();
		this.name = "Rohan";
		this.greeting = "ram ram";
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
