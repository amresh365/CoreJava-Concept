package pacineer;

public class Machine {
	final String type="Electric";
	public int id;
	class Test            //inner class 
	{  
		public void Example()
		{	
		System.out.println(id+" Id ");
		System.out.println("Type is " +type);
		}
		
	}
	
	class Artif
	{  // inner ClASS
		
		public void active() {
			System.out.println("Machine "+id+" is active");
		}
	}
	
	public Machine(int id) 
	{
		this.id = id;
		
	}
	
	public void run() {
		
		System.out.println("machine is running "+id);
		
		Artif ai=new Artif();	
		ai.active();
		
	Test test =new Test();
	test.Example();
	
	}
    
}
