package servertest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Application { //test 5
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234");
			
			PreparedStatement st =conn.prepareStatement("query");
			
			int rs = st.executeUpdate();
			
			while(true) {
				System.out.println(rs.getString("emp_ld")+" / "+rs.getString("emp_Name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
