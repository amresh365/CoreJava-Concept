package staticfinal;
class Student
{ 
	public static final int MY_CONSTANT=8;
	public static int count=0;
	public Student()     //constructor donot have any return type;
	{
		count++;
	}
	
	
	public
	String name;
public static String studentClass;

public void studentname()
{
	//System.out.println(name);   
	System.out.println(name+" is enrooled in "+ studentClass);
	//Non static method can acces static data;
}


public static void classinfo()
{
	System.out.println(studentClass);
	//   this gives an error System.out.println(name); not acces instanses variable a
	// a static method 
}


}

public class Application {
	public static void main(String[] args) {
		Student.studentClass="web deplopment fundamentol";
		System.out.println(Student.studentClass);
		
		Student.classinfo();
	   
		System.out.println("before creating the object "+Student.count);
		
		Student student1=new Student();
		Student student2=new Student();
		
		System.out.println("after creating the object "+Student.count);
		
		student1.name="amresh";
		student2.name="muskan";
		
		//System.out.println(student1.name);
	   //  	System.out.println(student2.name); 
		
		student2.studentname();           // here we call the class
		
		System.out.println(Math.E);
		System.out.println(student1.MY_CONSTANT);
		
	}

}
