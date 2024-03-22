package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDB {
	Connection con = null;	//����
	PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
	ResultSet rs = null;	//�˻�(Select��)�� ����� ��ȯ����
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "system";
	String userpw = "1234"; 
	
	public Connection connect() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL ó�� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(PreparedStatement pstmt, Connection con) {
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
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
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
}

