package sec0;  //�߿� ���˾Ƶ��� !!  Ȯ���ڴ� �������� ������ ��Ÿ��

import java.io.File;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args)	throws IOException {
		String file1 = "d:\\park\\java2\\a.txt";  //Local ���  
		String file2 = "http://192.168.1.104/data/menual/a.text"; // ���� ��� (web)
		File f1 =new File(file1);  //File �� ������ ���� ó���� �ʿ���
		
		String filename = f1.getName();
		System.out.println(filename);
		int pos = filename.lastIndexOf(".");
		System.out.println("Ȯ���ڿ� ���ϸ��� ������ ��Ÿ���� ���� ��ġ :"+pos);
		System.out.println("Ȯ���ڸ� ������ ������ �̸� : " +filename.substring(0,pos));
		System.out.println("Ȯ���� : " +filename.substring(pos+1));
		
		System.out.println("��θ� ������ ������ �̸�(������) : " +f1.getAbsolutePath() );
		System.out.println("��θ� ������ ������ �̸�(�����) : " +f1.getPath() );
		System.out.println("������ ���� �ִ� ����(�θ�) ���丮 : "+f1.getParent());
		System.out.println("��� ������ : "+File.separator); //File.separatorChar��  ����
		//�ý��� ���� ��� 
		System.out.println("���� ����� ���丮(user.dir) : "+System.getProperty("user.dir"));
		System.out.println("�ڹ� ���丮(sun.boot.class.path) : "+System.getProperty("sun.boot.class.path"));
		System.out.println("�ü�� (os) ȯ�� ���� ��:"+System.getenv());
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));
		
	}
}
