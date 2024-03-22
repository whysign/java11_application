package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//update ���̺�� set �ʵ��1=��1[,�ʵ��2,�ʵ��3][where �ʵ�� =��] : ���̺� �����Ϳ��� Ư�� ���ǿ� �´� ���ڵ忡 �����͸� �����Ѵ�.
public class OracleExam3 {
	public static void main(String[] args) {
		Connection con =null; //����
		PreparedStatement pstmt =null; //���� ����(On/Off) �ϰ� ,SQL �������
		ResultSet rs =null; //�˻�(Select��)�� ����� ��ȯ��
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "update student set point=?,name=? where no=?";
		Student1 st =new Student1(3,"�ڹں�",92);
		
		try {
			Class.forName(driver);
			try {
				con=DriverManager.getConnection(url,userid,userpw);
				pstmt= con.prepareStatement(sql);
				pstmt.setInt(1,st.getPoint());
				pstmt.setString(2,st.getName());
				pstmt.setInt(3,st.getNo());
				int i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"���� ���������� ó���Ǿ����ϴ�");
				}else {
					System.out.println("SQLó������");
				}
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ�SQL����ó������");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
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
