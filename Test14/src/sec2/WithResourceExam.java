package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class AutoResource implements AutoCloseable{ //AutoCloseAble : ��� �ݾ��ִ� �������̽��� .
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� �ڵ�����  Close �Ǿ����ϴ�");		
	}	
}

public class WithResourceExam {
	public static void main(String[] args) throws Exception {	
			//try~with~resource : ���� ���ҽ� �� ��� ������,
			try(AutoResource obj =new AutoResource()) {
				throw new Exception();
			} catch (IOException e) {			
				System.out.println("���� �κ�");
			}
	}
}