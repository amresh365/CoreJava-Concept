package sortaplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortStringLength implements Comparator<String>
{

	
	public int compare(String String1, String String2) {
		int StringLenght1=String1.length();
		int Stringlenght2=String2.length();
		if(StringLenght1>Stringlenght2)
		{
			return 1;
		}
		else if(StringLenght1<Stringlenght2)
		{
			return -1;
		}
		return 0;
	}

	
}
class SortReverseAlphabeticalOrder implements Comparator<String>{    //this may be reverse and not both


	public int compare(String string1, String string2) {
		// TODO Auto-generated method stub
		return -string1.compareTo(string2);
	}
	
	
	
}

public class Application {

	public static void main(String[] args) {
		
		List<String>colors= new ArrayList<String>();
		
        colors.add("green");
        colors.add("red");
        colors.add("puple");
        colors.add("voilet");
        colors.add("pink");
        
      //  Collections.sort(colors,SortStringLength());
        Collections.sort(colors, new SortReverseAlphabeticalOrder());//this is main calling and this is command
       
        for(String color:colors)
        {
        	System.out.println(color);
        }
        
        List<Integer>values=new ArrayList<Integer>();
        
        values.add(23);
        values.add(22);
        values.add(28);
        values.add(24);
        values.add(29);
        values.add(27);
        
        Collections.sort(values,new Comparator<Integer>() {
			public int compare(Integer value1, Integer value2) {
		     return -value1.compareTo(value2);
			}
        	
        }); 
        	
        
        
        for(int value:values)
        {
        	System.out.println(value);
        }

        
	}
}