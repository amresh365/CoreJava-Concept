package pachashandlinkset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Aplication {

	public static void main(String[] args) {
		//HashSet<String>test1=new HashSet<String>();
		//LinkedHashSet<String>test1=new LinkedHashSet<String>();//in this orderd set 
		TreeSet<String>test1=new TreeSet<String>();   //in this unorderd set

		HashSet<String>test2=new HashSet<String>();
		

		if(test1.isEmpty())
		{
			System.out.println("Set is Empty before Adding The Items");
		}
		System.out.println(test1);
		
		//
		for(String Items:test1)
		{
		System.out.println(Items);
		}
		//
		if(test1.isEmpty())
		{
			System.out.println("Set is Empty Ofter Adding The Value");
		}
		//
		if(test1.contains("blue")) {
			System.out.println("comtains blue");	
		}
		
		test2.add("red");
		test2.add("blue");
		test2.add("black");
		test2.add("yellow");
		test2.add("pink");
		
	    HashSet<String>diffrentItems=new	HashSet<String>(test1);
	    diffrentItems.removeAll(test2);
	    System.out.println(diffrentItems);	
		
		
		
		
		
	}

}
