package co.eureka.utilcollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		ArrayList<HashSet<String>> list = new ArrayList<HashSet<String>>();
		ArrayList<ArrayList<String>> list1 = new ArrayList<ArrayList<String>>();
		HashSet<ArrayList<String>> set1 = new HashSet<ArrayList<String>>();
		
		//Set<String> set = new HashSet<String>();
		
		HashSet set2 = new HashSet(); // any object
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>(); // Sorted
		set.add("John"); // not o index, rather will have some has value
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("Joe");
		
		System.out.println("set size is: "+set.size());
		
		System.out.println("set is: "+set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		if(set.contains("John")){
			System.out.println("John is in the set");
		}
		
		set.remove("Jennie");
		
		
	}

}
