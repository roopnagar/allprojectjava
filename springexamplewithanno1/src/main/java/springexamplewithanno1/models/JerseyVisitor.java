package springexamplewithanno1.models;

public class JerseyVisitor implements Visitor {
	private String name;
	private String greeting;
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public JerseyVisitor() {
		super();
		this.name = "Roop";
		this.greeting = "yo yo";
	}

	public String getName() {
		return name;
	}

	public String getGreeting() {
		return greeting;
	}

}
