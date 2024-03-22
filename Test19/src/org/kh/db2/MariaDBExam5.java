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
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
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
