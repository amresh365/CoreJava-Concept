package paclambda;
interface FuntionalInterface
{
       int start(int value);
}

interface anothorFuntionalInterface
{
       int start(String value);
}

class Car 
{
   public void drive(FuntionalInterface obj)
   {
	   
	System.out.println("driving the car");
	int number =	 obj.start(18);
	 System.out.println("returning the number "+number );//
	 
    }
	
}

public class Application {

	public static void main(String[] args) {
		Car car=new Car();

		
		//Anonymous class
		 car.drive(new FuntionalInterface() {
			 public int  start(int value)
			 {
				 System.out.println("Start driving....") ;
				 return 15*value; 
			 }
			 
		 });
		
		 
		 System.out.println(" ");
		 
			//lambda expression
		 
			 car.drive((value)->	{ 
				 System.out.println("Start driving.... ");
				
				  return 20*value;
				 
			 });
			 
			 
			 
	}
}