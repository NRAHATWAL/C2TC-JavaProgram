package package21jan;

public class ThreadDemo1 {

	public static void main(String[] args) {
		Ex1 thread1=new Ex1("First",2000);
		Ex1 thread2=new Ex1("Second",4000);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch(Exception e) {
			
		}
		for (int i=0;i<10;i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println("main"+i);
		}
		// TODO Auto-generated method stub

	}

}
