package pacserialise;

import java.io.Serializable;

public class Vehicle implements Serializable{
	private int serialnnumber;
    private String breand;
    
	public Vehicle(int serialnnumber, String breand) {
		this.serialnnumber = serialnnumber;
		this.breand = breand;
	}

	@Override
	public String toString() {
		return "Vehicle [serialnnumber=" + serialnnumber + ", breand=" + breand + "]";
	}
    
	
	
   
    
	
}
