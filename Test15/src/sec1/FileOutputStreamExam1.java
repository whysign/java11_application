package sec1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//FileoutputStream :������ ������ ����Ʈ ������ ���� ���� Ŭ���� 
public class FileOutputStreamExam1 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("b.txt");
		if(f1.createNewFile()) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("�̹� ������ �����մϴ�.");
		}
		String data = "Hello JAVA";
		FileOutputStream  fos = new FileOutputStream(f1);
		fos.write(data.getBytes());//getBytes()�� String�� byte ������ �迭�� ����
		fos.close();
	}		
}
