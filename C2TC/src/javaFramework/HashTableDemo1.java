package javaFramework;
import java.util.*;
public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String>map=new Hashtable<Integer,String>();
		map.put(100,"Amit");
		map.put(101,"Ravi");
		map.put(102,"Vijay");
		map.put(103,"Ajay");
		
		System.out.println("Before Remove:"+map);
		//remove value for key 102
		
		map.remove(102);
		System.out.println("After Remove:"+map);
		
		// TODO Auto-generated method stub

	}

}
