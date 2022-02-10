package BatchUpdate;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class DButil2 {
	
		private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
		private static final String DB_USERNAME="root";
		private static final String DB_PASSWORD="neha";
		private static final String DB_URL="test:mysql://localhost:3306/test";
		
		
		private static Connection connection=null;
		static {
			try {
				
					Class.forName(DB_DRIVER_CLASS);
				connection=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		}
		
		public static Connection getConnection()
		{
			
			return connection;
		}


		
	}





