
public class Villain extends Hero {

	public Villain(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	
	}
	
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++
	public void steals(){
		System.out.println(this.name + " is stealin");
	}
	
	public void kills(){
		System.out.println(this.name + " is goin' around ");
	}

}
