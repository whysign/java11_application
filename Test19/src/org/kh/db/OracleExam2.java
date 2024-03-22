package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//insert into 테이블명 [필드명1,필드명2,....] values(값1,값2,값3,.....) : 테이블에 레코드를 추가 
public class OracleExam2 {
	public static void main(String[] args) {
		Connection con =null; //연결
		PreparedStatement pstmt =null; //상태 변경(On/Off) 하고 ,SQL 문장실행
		ResultSet rs =null; //검색(Select문)의 결과를 반환받
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "Insert into student values(?,?,?)";
		Student1 st = new Student1(7,"박은성",90);
		int i=0;
		try {
			Class.forName(driver); //드라이버 로딩
			try {
				con =DriverManager.getConnection(url,userid,userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,st.getNo());
				pstmt.setString(2,st.getName());
				pstmt.setInt(3,st.getPoint());
				int i1 = pstmt.executeUpdate();
				if (i1>0) {
					System.out.println(i1+"건이 성공적으로 처리 되었습니다");				
				}else {
					System.out.println("SQL문 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL문장이 잘못되어서 처리 실패");				
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
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
	}
}
