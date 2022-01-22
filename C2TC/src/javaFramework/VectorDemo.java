package javaFramework;

import java.util.Enumeration;
import java.util.Vector;

class Student3
{
	int id;
	String name;
	int grade;
	
	public Student3(int id,String name,int grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public String toString()
	{
		String str="Student is["+id+","+name+","+grade+"]";
		return str;
	}
}

public class VectorDemo {

	public static void main(String[] args) {
		Student3 s1=new Student3(11,"Shiva", 100);
		Student3 s2=new Student3(12,"Shiv",90);
		Vector v=new Vector();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(20);
		v.addElement("99");
		v.addElement("99");
		v.addElement(new String("999"));
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Object o=e.nextElement();
			System.out.println(o);
		}
		// TODO Auto-generated method stub

	}

}
