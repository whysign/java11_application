package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//��ø ���� ó�� : try~catch ����ȿ�  try~catch�� �������� ����Ǵ� ���
//���ǻ��� :
public class ExceptionExam8 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;	
		try {
			fis =new FileInputStream("indata.txt");
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ������ ã���������ϴ�");
		} catch(Exception e) {
			System.out.println("���κҸ�");
			e.printStackTrace();
		}finally {
			System.out.println("���� ó�� ����");
		}
	}

}
