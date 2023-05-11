package pacinter;

public class vehicle implements Information {//extands only one class &imlement many interface ;
	private String type; 
	public vehicle(String type) {
	super();
         this.type=type;
	}

	public void drive()
	{
		System.out.println("Driving the vehicle");
	}
	public void displyinformation()
	{
		System.out.println("Vegicle type is "+type);
	}
	

}
