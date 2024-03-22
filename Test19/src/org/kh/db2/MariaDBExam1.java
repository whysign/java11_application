package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db.Student1;

public class MariaDBExam1 {
	public static void main(String[] args) {
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
		ResultSet rs = null;	//�˻�(Select��)�� ����� ��ȯ����
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234"; 
		String sql = "select * from student";
		List<Student1> stList = new ArrayList<>();
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url,userid,userpw);
				pstmt =con.prepareStatement(sql);
				rs =pstmt.executeQuery();
				while(rs.next()) {
					Student1 st =new Student1(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Student1 s:stList) {
			System.out.println(s.toString());
		}
		
	}
}
