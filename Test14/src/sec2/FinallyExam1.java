package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExam1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		//finally : ���ܻ����� try �Ǿ� ���� ������ �ϰ� �ǵ� exception �Ǿ� ���� ������ �ϵ� �ݵ�� ó���ؾ��ϴ� ����
		try {
			fis = new FileInputStream("a.txt");			
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("�����̵� ���е� �׻� ����");			
		}
		
		System.out.println("����ó���� ���� ����");
	}

}
