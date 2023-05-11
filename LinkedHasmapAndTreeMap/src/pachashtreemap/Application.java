package pachashtreemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>linkedhashmap=new LinkedHashMap<Integer,String>();
	    TreeMap<Integer,String>TreeMap=new TreeMap<Integer,String>();
	    sortedMap(TreeMap);
	}
	public static void sortedMap(Map<Integer,String>map) {
		map.put(3, "limika");
		map.put(4, "icecream");
		map.put(1, "cocola");
		map.put(6, "sprite");
		map.put(7, "pizza");
		map.put(9, "burger");
		map.put(8, "momos");
		for(Integer numbers:map.keySet())
		{
			String food=map.get(numbers);
			System.out.println(numbers+":"+food);
		}
	}

}
