package pacstbl;

public class Alpplication {
public static void main(String[] args) {
	
	String example1="HELLO ";
	example1+="myname ";
	example1+="amresh gupta ";
	
	System.out.println(example1);
	
	StringBuilder example2= new StringBuilder();
	example2.append("HELLO");
	example2.append("my name ");
	example2.append("amresh gupta");
	
	String text=example2.toString();
	System.out.println(text);
	
	String name="amresh";
	StringBuilder  example3=new StringBuilder("hello!");
    example3.append("this my ").append("aim is complete java ").append(name);
	
	
	System.out.println(example3);
	

}
}
