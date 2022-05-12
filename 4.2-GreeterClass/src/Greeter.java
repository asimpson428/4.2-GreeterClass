
public class Greeter {

	private String greeting;

	public Greeter(String greeting2) {
		// TODO Auto-generated constructor stub
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) { 
		return  this.greeting + ", " +  name + "!";
	}

}
