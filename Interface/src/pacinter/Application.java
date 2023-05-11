package pacinter;

public class Application {
	public static void main(String[] args) {
		Computer computer1=new Computer();
		computer1.start();
		
		vehicle vehicle1=new vehicle("Car");
		vehicle1.drive();
		
		Information info=new Computer();
		info.displyinformation();
		
		
		Information info1=vehicle1;
		info1.displyinformation(); 
		
		
		System.out.println();
		
		showinformation(computer1);
		showinformation(vehicle1);
		
	}
	
	private static void showinformation(Information anyinfo)
	{
		anyinfo.displyinformation();
	}
	
	
	

}
