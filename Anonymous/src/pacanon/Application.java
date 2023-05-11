package pacanon;

class Computer
{
   public void shutdown() 
   {
	   System.out.println("Computer is shutdown");
	 
   }
  
}
interface phone{
	   public void call();
}

public class Application {
	public static void main(String[] args) {
		
	Computer computer1=new Computer() {
		@Override
		public void shutdown()
		{
			System.out.println("macbook is shutting down");
		}
	};
	computer1.shutdown();
	
	
	
	phone phone1=new phone() {

		@Override
		public void call() {
		
			System.out.println("calling....");
			
		}
			};
		phone1.call();
	
	}

}