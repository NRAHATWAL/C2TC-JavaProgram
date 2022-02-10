package Generics;


interface MinMax<T extends Comparable<T> >
{
	T min();
	T max();
	
}
public class GenericsInterfaceDemo<T extends Comparable<T> >
implements MinMax<T>
{   
	T[]values;
	GenericsInterfaceDemo(T[]obj)
	{
		values=obj;
	}
	
	@Override
	public T min()
	{
		T o1=values[0];
		
		for(int i=1;i<values.length;i++)
			if (values[i].compareTo(o1)<0)
				o1=values[i];
		return o1;
					
	}
	
	@Override
	public T max()
	{
		T o1=values[0];
		
		for(int i=1;i<values.length;i++)
			if(values[i].compareTo(o1)>0)
				o1=values[i];
		return o1;
		
	}
	

	public static void main(String[] args) {
		
		Integer arr[]= {3,5,6,9,2,4,3};
		GenericsInterfaceDemo<Integer> obj1=new GenericsInterfaceDemo<Integer>(arr);
		
		System.out.println("Minimum value is :"+obj1.min());
		System.out.println("Maxmum value is :"+obj1.max());

		// TODO Auto-generated method stub

	}

	
	}


