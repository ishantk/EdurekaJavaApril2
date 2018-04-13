package co.eureka.utilcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

// Object is the root class in Java. Every class extends it !!
class Employee{ //extends Object{
	int eid;
	String name;
	
	public void showEmp(){
		System.out.println(eid+ " belongs to "+name);
	}
	
	public String toString(){
		return eid+" - "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(); 						// Raw Type | list1 can have any type of object
		ArrayList<String> list2 = new ArrayList<String>(); 		// Generic Type | list2 can only have String Objects
		ArrayList<Employee> list3 = new ArrayList<Employee>(); 	// Generic Type | list2 can only have Employee Objects
		List<Integer> list4 = new ArrayList<Integer>(); 		// Primitives not allowed, RTP
		
		// Adding data in ArrayList
		
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.name = "Fionna";
		
		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "George";
		
		list1.add("John"); // -> list1.add(0,"John"); | 0th index
		list1.add("Jennie");
		list1.add(100);
		list1.add(200);
		list1.add(10.22);
		list1.add(emp1);  // n-1 index
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Jennie"); // list can contain duplicate data
		list2.add("Joe");
		//list2.add(10); err
		//list2.add(emp1); err
		
		list3.add(emp1);
		list3.add(emp2);
		
		list4.add(100); // list4.add(new Integer(100)); // AutoBoxing Happens here
		list4.add(200);
		list4.add(300);
		list4.add(400);
		list4.add(500);
		
		
		// Retrieving the data
		System.out.println("list1 is: "+list1);
		System.out.println("list2 is: "+list2);
		System.out.println("list3 is: "+list3);
		System.out.println("list4 is: "+list4);
		
		String str = new String("This is Awesome");
		System.out.println(str); // Because toString method of Object class is overrided in String class
		
		System.out.println("----------------------");
		
		// Retrieve one object
		Object obj = list1.get(0);
		String name = list2.get(1);
		Employee emp = list3.get(1);
		Integer iRef = list4.get(3);
		
		System.out.println(obj);
		System.out.println(name);
		System.out.println(emp);
		System.out.println(iRef);
		
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		int idx = list2.indexOf("Leo");
		//idx = list2.lastIndexOf("Jennie");
		System.out.println("Leo is at "+idx+" index");
		
		if(list2.contains("John"))
			System.out.println("John is in the list");
		
		/*list2.remove(1);
		System.out.println(list2);
		
		list2.clear(); // remove all
		System.out.println(list2);
		
		if(list2.isEmpty())
			System.out.println("List2 is Empty");*/
		
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("George");
		list5.add("Harry");
		list5.add("Mike");
		
		list2.addAll(list5);
		
		System.out.println(list2);
		
		// Read All 
		//1. For Loop
		System.out.println("-----For Loop-----");
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(nm);
		}
		System.out.println("------------------");
		for(int i=0;i<list1.size();i++){
			Object o = list1.get(i);
			System.out.println(o);
		}
		System.out.println("------------------");
		for(int i=0;i<list3.size();i++){
			Employee e = list3.get(i);
			System.out.println(e);
		}
		
		//2. Enhanced For Loop
		System.out.println("-----Enhanced For Loop-----");
		for(String nm : list2){
			System.out.println(nm);
		}
		System.out.println("------------------");
		for(Object o : list1){
			System.out.println(o);
		}
		System.out.println("------------------");
		for(Employee e : list3){
			System.out.println(e);
		}
		
		//3. Iterator
		System.out.println("-----Iterator-----");
		Iterator<Object> itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object o = itr1.next();
			System.out.println(o);
		}
		System.out.println("------------------");
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String s = itr2.next();
			System.out.println(s);
			
			if(s.equals("Jennie")){
				itr2.remove(); // removes from the list
			}
		}
		
		System.out.println("------------------");
		
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee e = itr3.next();
			System.out.println(e);
		}
		
		//4. List Iterator
		System.out.println("-----List Iterator-----");
		ListIterator<String> listiItr2 = list2.listIterator();
		while(listiItr2.hasNext()){
			String s = listiItr2.next();
			System.out.println(s);
		}
		System.out.println("------------------");
		while(listiItr2.hasPrevious()){
			String s = listiItr2.previous();
			System.out.println(s);
		}
		
		//5. Enumeration
		System.out.println("-----Enumeration-----");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		System.out.println("---------Vector---------");
		Vector<String> vector = new Vector<String>(); // Thread-Safe i.e. Synchronized
		vector.add("John");
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println(vector);
		
		for(int i=0;i<vector.size();i++){
			System.out.println(vector.get(i));
		}
		
		
	}

}
