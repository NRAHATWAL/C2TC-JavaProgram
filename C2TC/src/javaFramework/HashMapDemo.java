package javaFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		
		map.put(1,"Mango");
		map.put(2, "Apple");
		map.put(3, "Cherry");
		map.put(4, "Grapes");
		map.put(null, null);
		map.put(100, "null");
		map.put(null, "berry");
		System.out.println("Iterating Hashmap...");
		
		for (Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		
		}
		// TODO Auto-generated method stub

	}

}
