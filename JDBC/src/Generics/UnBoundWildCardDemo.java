package Generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundWildCardDemo {
	
	public static void display(List<?>l1)
	{
		for(Object o:l1)
		{
			System.out.println(o);
			
		}
	}

	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(1,2,3);
		System.out.println("Display values");
		display(l1);
		
		List<String> l2=Arrays.asList("Hi","Hello","How are you");
		System.out.println(l2);
		display(l2);

	}

}
