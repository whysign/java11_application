package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// ���� ���ѱ��
public class ThrowsExam {

	public static void main(String[] args) throws  FileNotFoundException,IOException  { //�̷������� throws �� ������ ������ ���ѱ涧 �����ִ�.
		FileInputStream fis =null;
		String absolutePath =("d:\\kim\\java2\\test14\\bin\\sec2\\a.txt");// d:\\kim\\java2\\test14\\bin\\sec2\\a.txt << �̷��� �����°��� �����ζ���Ѵ�
		String relativePath = "./a.txt"; //����� -> ���� ���丮
		String relativePath2 = "../a.txt";//����� -> ���� ���丮
		String relativePath3 = "../../a.txt"; //����� -> test14 ���丮 �ȿ�
		fis =new FileInputStream(absolutePath);
		if(fis!=null) {
			fis.close();
		}		
	}	
}
