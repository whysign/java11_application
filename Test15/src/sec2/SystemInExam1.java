package sec2;

import java.io.IOException;

public class SystemInExam1 {
	public static void main(String[] args) throws IOException{
		System.out.println("���� �� ���ڸ� �Է��ϰ� , [Enter]�� �������� ");
		int i ;
		try {
			i= System.in.read(); // �ƽ�Ű�ڵ� �� ���� �Է� => ����Ʈ ���� �Է�
			System.out.println(i);
			System.out.println("�Էµ� ����  : "+((char)i));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
