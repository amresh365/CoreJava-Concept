package pacpassvalue;

public class Cat {

	private String name;

	public Cat(String name) {
		this.name=name;
		
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}

	// toString is run all thin of to string funtion when we want to print the object of  which claas in toString method 
	public String toString() 
	{
		return "Cat [name=" + name + "]";
	}
	
	
	

}
