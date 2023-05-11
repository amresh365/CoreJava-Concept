package pacarraclink;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>values=new ArrayList<Integer>();
		//[0][1][2][3][4][5]......
		
		LinkedList<Integer>linklist= new LinkedList<Integer>();
		//[0]->[1]->[2]->[3]->[5]......
		
		values.add(10);
		values.add(8);
		values.add(45);
		values.add(15);
		
		System.out.println(values.get(2));
		System.out.println();
		
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		
		System.out.println();
		values.remove(values.size()-1);
		
		for(int myvalues: values)
		{
			System.out.println(myvalues);
		}
		
	}

}
