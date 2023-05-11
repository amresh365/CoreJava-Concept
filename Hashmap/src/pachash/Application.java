package pachash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String>map=new HashMap<Integer,String>();
     map.put(5, "Tiger");
     map.put(9," Lion");
     map.put(8, "Monkey");
     map.put(3, "Snake");
     map.put(6, "Zebra");
     
     String animal=  map.get(5);
     System.out.println(animal);
     
     for(Map.Entry<Integer,String>myanimal:map.entrySet())
     {
    	 int key=myanimal.getKey();
    	 String value=myanimal.getValue();
    	 
    	 System.out.println(key+": "+value);
     }
     
	}

}
