package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//����Ʈ ��Ʈ�� ������ ������ ������ �������� �� ��� Ȱ��
//����Ʈ �����̹Ƿ� char�� ��ȯ�Ͽ� �о�;� �ϸ�,
//�����ڵ� �ش��ϴ� �ѱ��̳� ���� ���� ���� �о� ���� ����.
public class FileInputStreamExam1 {
	public static void main(String[] args)throws IOException {
		File f1 =new File ("a.txt");
		//EDF(end of file) => -1�� �ǹ���
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i= fis.read()) !=-1) {
			System.out.println((char) i);
		}
	}
}

