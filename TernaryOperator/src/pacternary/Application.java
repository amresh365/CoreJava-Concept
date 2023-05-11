package pacternary;

public class Application {
	public static void main(String[] args) {
		
		System.out.println(true?"true":"false");
		int number =20;
		 number=number>20 ? number:20;
		 System.out.println(number);
		 
	//to find lowest number	 
		int numbers[]= {7,8,7,9};
		int lowestNumber=Integer.MAX_VALUE;
		
		for(int currentNumber:numbers)
		{
			lowestNumber=currentNumber<lowestNumber?currentNumber:lowestNumber;
		}
		System.out.println(lowestNumber);
	

	}

}
