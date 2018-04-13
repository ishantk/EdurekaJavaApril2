package co.eureka.utilcollections;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		//HashMap map = new HashMap();
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		
		// Keys are unique, cannot be duplicated. Value can be...
		map.put(101, "John");
		map.put(312, "Jennie");
		map.put(145, "Jim");
		map.put(786, "Jack");
		map.put(543, "Joe");
		map.put(123, "John");
		map.put(null, "Leo"); // null keys
		map.put(643, null);   // null value
		map.put(101, "Fionna"); // put the key again with a different value, its an update operation
		
		System.out.println(map);
		
		String nm = map.get(145);
		System.out.println(nm);
		
		if(map.containsKey(145)){
			System.out.println("145 key is in the map");
		}
		
		if(map.containsValue("Jennie")){
			System.out.println("Jennie is in the map");
		}
		
		map.remove(101);
		
		System.out.println(map);
		
		// 1. Iterate in Map using keySet()
		Set<Integer> keys = map.keySet(); // Obtain set of keys in map
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+" - "+value);
		}
		
		System.out.println("---------------------");
		
		//2. Key Value Pair in a Map is called Entry (Set of Entries...)
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		Iterator<Entry<Integer,String>> itr1 = entrySet.iterator();
		while(itr1.hasNext()){
			Entry<Integer,String> entry = itr1.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(312, "Jennie");
		table.put(145, "Jim");
		table.put(786, "Jack");
		table.put(543, "Joe");
		table.put(123, "John");
		//table.put(null, "Leo"); // no null keys allowed
		//table.put(643, null);   // no null value allowed
		table.put(101, "Fionna"); // put the key again with a different value, its an update operation
		
		System.out.println(table);
	}

}
