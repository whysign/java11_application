package sec1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//바이트 스트림 단위로 파일의 내용을 읽으려고 할 경우 활용
//바이트 단위이므로 char로 변환하여 읽어와야 하며,
//유니코드 해당하는 한글이나 전각 문자 등을 읽어 낼수 없다.
public class FileInputStreamExam1 {
	public static void main(String[] args)throws IOException {
		File f1 =new File ("a.txt");
		//EDF(end of file) => -1을 의미함
		FileInputStream fis = new FileInputStream(f1);
		int i;
		while((i= fis.read()) !=-1) {
			System.out.println((char) i);
		}
	}
}

