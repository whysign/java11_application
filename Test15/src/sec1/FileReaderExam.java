package sec1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader,FileReader : 문자(열) 단위로 읽기
public class FileReaderExam {
	public static void main(String[] args)throws IOException {
		File file =new File("a.txt");
		if(file.exists()) {
			FileReader f= new FileReader(file);		
			while(f.read() > 0) {				
				System.out.println(f.read());
			}
		}
	}
}
