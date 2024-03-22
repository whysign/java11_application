package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.db.Student1;

public class MariaDBExam3 {
	public static void main(String[] args) {
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234"; 
		Student1 upSt = new Student1(3,"kim",45);
		String sql ="update student set name=?,point=? where no=?";
		try {
			Class.forName(driver);
			try {
				con=DriverManager.getConnection(url,userid,userpw);
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, upSt.getName());
				pstmt.setInt(2, upSt.getPoint());
				pstmt.setInt(3,upSt.getNo());
				int i= pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"ó���Ϸ�");
				}else {
					System.out.println(i+"ó���Ұ�");
				}
			} catch (SQLException e) {
				System.out.println("����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����");
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
