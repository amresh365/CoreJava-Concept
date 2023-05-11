package pacmultipal;

import java.io.IOException;
import java.text.ParseException;

public class Application {
	public static void main(String[] args) {
		multiplexcep me=new multiplexcep();
		
//	try {
//		me.start();
//	} catch (IOException e) {
		// TODO Auto-generated catch block
	//	e.printStackTrace();
		
	//} catch (ParseException e) {
//		System.out.println("Wrong formet");
//	}
	
	try {
		me.start();
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	 
		
		
		
		
		
		
	
	}

}
