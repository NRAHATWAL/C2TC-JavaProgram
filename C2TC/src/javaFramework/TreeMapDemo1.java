package javaFramework;

import java.util.*;
import java.util.Map;
public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(100, "Ajay");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Ram");
		//map.put(null,"Raj");
		map.put(105, null);
		
		for (Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		// TODO Auto-generated method stub

	}

}
