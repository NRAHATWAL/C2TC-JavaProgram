package exceptionHandling;


	import java.io.IOException;
	public class ExcpThrowsDemo6 {
	
	void m()throws IOException
		{
		throw new IOException("device error");//checked exception
		}
		void n()throws IOException
		{
		m();
		}
		void p()
		{
		try
		{
		n();
		}
		catch(Exception e){System.out.println("exception handled");}
		}
		public static void main(String args[])
		{
			 ExcpThrowsDemo6  obj=new  ExcpThrowsDemo6();
		obj.p();
		System.out.println("normal flow...");
	}
	}


