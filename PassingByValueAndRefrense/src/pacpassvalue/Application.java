package pacpassvalue;

public class Application {
public static void main(String[] args) {
	// passsing byprimitive type
    int number=10;
    
	Application app1=new Application();
	System.out.println("Number "+number);
	
	app1.disply(number);
	System.out.println("Number "+number);
	
	// passing non primitive
	
	System.out.println();
	 
	Cat cat=new Cat("Luna"); //here we are creating a address 
	System.out.println("1:"+cat);
	
	app1.disply(cat);
	System.out.println("4:"+cat);
	
}

public void disply(int Number)
{
	System.out.println("Number "+Number);
	Number=15;
	
	System.out.println("Number "+Number);
}

public void disply(Cat cat )
{
	System.out.println("2:"+cat);
	
	cat.setname("oliver");
	
	 cat=new Cat("sunshine");    // here we are creating new address;
	 
	 System.out.println("3:"+cat);
	 
	 
}





}
