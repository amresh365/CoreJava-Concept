package pacenum;

public class Application {
//public static final int RED=1;
//public static final int GREEN=2;
//public static final int BLUE=3;
	
	public static void main(String[] args) {
	Color color= Color.BLUE;
	
	switch(color)
	{
	case BLUE:
		System.out.println("BLUE");
		break;
	case GREEN:
		System.out.println("GREEN");
		break;
	case RED: 	
		System.out.println("RED");
		break;
	default:
		System.out.println("NOT ,MATCH");
		break;
	
	}
	System.out.println(Color.RED);
	System.out.println(Color.GREEN.getMeaning());
	System.out.println("Enum meaning as astring is "+Color.RED.name());
	System.out.println(Color.GREEN instanceof Enum );
	System.out.println(Color.RED.getMeaning());
	
	Color color1=Color.valueOf("BLUE");
	System.out.println(color1);
	
	
	
	
	}

}
