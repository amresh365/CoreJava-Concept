package pacencasu;
class Car{
public static final  int speed =150;
 private String type  ;
public String gettype()
{
	return type;
}

public String settype(String type)
{
	this.type=type; 
	return type;
}
public String getrevenueData()
{
	String data="Revenue"+TocalculateRevenue();
	return data;
}

public  int TocalculateRevenue()
{
	return 12000;
}

}


public class App {
	public static void main(String[] args)
	{
		Car car=new Car();
	}

}
