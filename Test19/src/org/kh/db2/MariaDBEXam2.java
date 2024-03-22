package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.db.Student1;

public class MariaDBEXam2 {
	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234"; 
		Student1 newSt = new Student1(6,"park",95);
		String sql ="insert into Student values(?,?,?)";
		int i=0;
		try {
			Class.forName(driver);
			try {
				con =DriverManager.getConnection(url,userid,userpw);
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,newSt.getNo());
				pstmt.setString(2,newSt.getName());
				pstmt.setInt(3,newSt.getPoint());
				int i1=pstmt.executeUpdate();
				if(i1>0) {
					System.out.println(i1+"성공했다.");
				}else {
					System.out.println(i+"실패했다.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
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
		
		
	}  //MariaDB의temp 데이터베이스의 student 테이블의 newSt의 내용을 추가되도록 자바로 구현 
}
