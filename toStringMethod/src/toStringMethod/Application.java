package toStringMethod;
class Employe
{
	private int id;
    private String name;
 
	public  Employe(int id,String name)// constructor to set id and name
	{
		this.id=id;
		this.name=name;
	}
	public String toString()// to string method
	{
		return("ID:"+id+"-"+"full name: "+name);
	}
}
public class Application {
	public static void main(String[] args) {
		 
		Employe employe1=new Employe(100,"amresh");
		Employe employe2=new Employe(200,"muk");
	
		
	System.out.println(employe1);
	System.out.println(employe2);
	}

}
