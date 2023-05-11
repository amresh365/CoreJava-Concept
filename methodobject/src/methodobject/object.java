package methodobject;
class method{
	String animal;
	int month;
	int value;
	void run()
	{
	System.out.println("running");
	System.out.println("my "+animal+"is "+value+" years old.");
	}
	int  calculateMonthTobirth()
	{
		int monthLeft=12-month;
		
		//System.out.println("the month left" +monthLeft);
		return monthLeft;
	}
	void talk(String text)
	{
		System.out.println(text);
		
	}
	void speed(int speed)
	{
		System.out.println("walking "+speed+"  km/hr");
	}
	void timer(int minut,double second)
	{
		System.out.println("It look "+minut+" and "+second+" To get down the hill.");
		
	}
	
	
	
}

public class object {
	public static void main(String[] args) {
		method o1=new method();
		o1.animal="lion";
		o1.value=13;
		o1.month=9;
		o1.talk("hi,i am amresh gupta");
		String s="hello there";
		o1.talk(s);
		//o1.run();	
		int month=o1.calculateMonthTobirth();
		o1.speed(9);
		o1.timer(4, 4.2);
		System.out.println(month);
	}

}
