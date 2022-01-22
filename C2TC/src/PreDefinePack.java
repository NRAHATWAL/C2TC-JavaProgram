
import java.util.Scanner;

public class PreDefinePack {

public static void main (String[]args)
{
  try (Scanner sc = new Scanner(System.in)) {
	int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("sum is"+(a+b));
	  
	  
	  PreDefinePack obj=new PreDefinePack();
	  System.out.println(obj.getClass());
	  System.out.println(sc.hashCode());
}
}

}
