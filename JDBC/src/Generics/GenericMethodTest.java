package Generics;

public class GenericMethodTest {
	
	public <E>void displayArrayElements(E[]elements)
	{
		for(E element:elements)
		{
			System.out.println("element is :"+ elements);
		}
	}

	public static void main(String[] args) {
		GenericMethodTest obj=new GenericMethodTest();
		Integer[]intarray= {10,20,30,40};
		String[]str= {"java","programming","learning"};
		
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);
		

	}

}
