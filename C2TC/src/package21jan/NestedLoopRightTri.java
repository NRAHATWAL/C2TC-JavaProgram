package package21jan;
import java.util.*;
public class NestedLoopRightTri {

	public static void main(String[] args) {
		
		{ 
			 int i,j,rows;
			 Scanner sc = new Scanner(System.in);
			     System.out.println("Enter the number of rows");
			     rows = sc.nextInt();
			    
			 for(i=1;i<=rows;i++)
			     {
			         for(j=1;j<=i;j++)
			         {
			             System.out.print("* ");
			         }
			         System.out.println("");
			     } 
		}
	}}
			