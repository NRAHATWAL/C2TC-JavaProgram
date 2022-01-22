package javaFramework;
import java.util.*;
public class HashTableDemo2 {

	public static void main(String[] args) {
		
	Hashtable<Integer,String>map=new Hashtable<Integer,String>();
	map.put(100, "Ajay");
	map.put(101, "vijay");
	map.put(102, "Avi");
	map.put(103, "Jon");
	map.put(104, "Nitin");
	map.put(105, "Ram");
	System.out.println("Intial Map:"+map);
	//inert as the specified pair is unique
	
	map.putIfAbsent(106, "Raj");
	System.out.println("Update Map:"+map);
	//return the current value as the specified pair already exist
	
	map.putIfAbsent(101, "Vijay");
	System.out.println("Upadte Map:"+map);
	
		// TODO Auto-generated method stub

	}

}
