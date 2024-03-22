package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//insert into ���̺�� [�ʵ��1,�ʵ��2,....] values(��1,��2,��3,.....) : ���̺� ���ڵ带 �߰� 
public class OracleExam2 {
	public static void main(String[] args) {
		Connection con =null; //����
		PreparedStatement pstmt =null; //���� ����(On/Off) �ϰ� ,SQL �������
		ResultSet rs =null; //�˻�(Select��)�� ����� ��ȯ��
		String driver ="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="system";
		String userpw = "1234";
		String sql = "Insert into student values(?,?,?)";
		Student1 st = new Student1(7,"������",90);
		int i=0;
		try {
			Class.forName(driver); //����̹� �ε�
			try {
				con =DriverManager.getConnection(url,userid,userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1,st.getNo());
				pstmt.setString(2,st.getName());
				pstmt.setInt(3,st.getPoint());
				int i1 = pstmt.executeUpdate();
				if (i1>0) {
					System.out.println(i1+"���� ���������� ó�� �Ǿ����ϴ�");				
				}else {
					System.out.println("SQL�� ����");
				}
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL������ �߸��Ǿ ó�� ����");				
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
