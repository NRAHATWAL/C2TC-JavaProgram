package BatchUpdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class BatchUpdateClient {

	
	private static final Statement DButil2 = null;

	public static void main(String[] args)  throws SQLException { 
		Connection connection = DButil2.getConnection (); 
		if (connection != null) 
		System.out.println("JPBC:connection is taken.."); 
		Statement 
		st=connection.createStatement(); 
		String sql1="INSERT INTO employee (employee_id,employee_name,email)"+ 
		"VALUES (9,' Sharath','sharath@gmail.com',)"; 
		st.addBatch (sql1); 
		String sql2="update employee set employee_name='Abhishek' where employee_id=f"; 
		st.addBatch (sql2); 
		String sql3="delete from employee where employee_id=5"; 
		st.addBatch (sql3); 
		
		int i[]=st.executeBatch(); 
		for(int j=0; j<i.length; j++)
		System.out.println (j); 
		try 
		{ 
		connection.close();
		}
		
          catch(Exception e)
		{ 
        	  System.out.println(e) ;
		}


		}}
