package pacserialise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {
public static void main(String[] args) {
	System.out.println("Reading the program...");
	
	try {
		FileInputStream fileInput=new FileInputStream("vehicle.data");
		
		ObjectInputStream objectinput=new 	ObjectInputStream (fileInput);
		Vehicle vehicle1=(Vehicle)objectinput.readObject();
		Vehicle vehicle2=(Vehicle)objectinput.readObject();
		
		objectinput.close();
		
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
}


}
