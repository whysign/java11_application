package sec1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//FileNotFoundException : �ش� ��ο� ������ �������� �ʴ� ��� �߻��ϴ� ��� �߻��ϴ� ����
public class ExceptionExam7 {

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
