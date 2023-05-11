package constructor;
class Program{
	String text;
	int value;
 public 
	Program()
	{
	 
	  this(5);//calling 2nd constructor;
		System.out.println("1st constructor  is work");
		value=20;
	}
      Program(int val)
     {
    	this.value=val; 
    	System.out.println("2nd constructor work");
    	//System.out.println(val);
     }
      Program(int val,String text)
      {
    	  this();//calling first constructor;
    	  this.value=val;
    	  this.text=text;
    	  System.out.println("3nd constructor work"); 
    	  System.out.println(text);
    	  
      }
 
 
 
 
     
}
public class construct {
public static void main(String[] args) {
	Program newProgram=new Program();//here we create a new object of class
	Program newProgram1=new Program(2);
	Program newProgram2=new Program(2,"hi");
}

}
