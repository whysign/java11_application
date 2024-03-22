package org.kh.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db.Student1;

public class MariaDBExam5 {

	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		ResultSet rs= null;
		MariaDB maria =new MariaDB();
		String sql ="select * from student";
		List<Student1>stList =new ArrayList<>();
		
		try {
			con=maria.connect();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Student1 st= new Student1(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			maria.close(rs, pstmt, con);;
		}
		
	}
}
