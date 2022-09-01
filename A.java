package jdbc_3;

import java.sql.Connection;
import java.sql.DriverManager;

public class A {
	
	

		

		
		
			public static void main(String[] args) {
				try {
					// connect to database
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Munna@123");
					
					System.out.println(" dataBASE conneted ");
					
					con.close();
					
				}catch (Exception e) {
					e.printStackTrace();
					
				}
			}

		}






