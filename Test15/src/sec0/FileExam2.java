package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException{
		//������ ��� ��� ����
		File f1 =new File("a.txt"); // ���� ���丮�� ������ �ֵ� ���� ���� ��ü ����
		File f2= new File("../sec1/a.txt");;//���� ��Ű�� �� sec0�ε� �������丮�� �̵����� sec1 ���丮�� a.txt�� ��ü�� ����
		
		//������ ���� ��� ����
		File f3 =new File("d:"+File.separator+"Park"+File.separator+"Java2"+File.pathSeparator+"a.txt");
		String path ="d:\\park\\java2\\";
		File f4 =new File(path,"a.txt");
		File f5 =new File("d:\\park\\java\\","a.text");
	}
}
