import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientTest {

	public static void main(String[] args) throws SQLException {
		
		Connection connection =DBUtil1.getConnection();
		if (connection !=null)
			System.out.println("JDBC:connection is taken...");
		Statement st=connection.createStatement();
		String sql="insert into employee(employee_id,"+"employee_name,email)"+"values(103,'neha','neha@gmail')";
		int n=st.executeUpdate(sql);

System.out.println(n +"row"+"afftected");
		
		
		
		try
		{
			connection.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub

	}

}
