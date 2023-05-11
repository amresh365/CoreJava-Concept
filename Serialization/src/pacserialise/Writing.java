package pacserialise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writing {
public static void main(String[] args) {


System.out.println("Wrinting the object....")	;	
	Reading reading=new Reading();
	Vehicle car=new Vehicle(1233,"HP");
	Vehicle truck=new Vehicle(1233,"HP");
	
	System.out.println(car);
	System.out.println(truck);
	
	
		try {
			FileOutputStream fileOutput=new FileOutputStream("vehicle.data");
			ObjectOutputStream objectoutput=new ObjectOutputStream(fileOutput);
			objectoutput.writeObject(car);
			objectoutput.writeObject(truck);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
}
}
