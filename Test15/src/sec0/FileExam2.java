package sec0;

import java.io.File;
import java.io.IOException;

public class FileExam2 {
	public static void main(String[] args) throws IOException{
		//파일의 상대 경로 지정
		File f1 =new File("a.txt"); // 현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2= new File("../sec1/a.txt");;//현재 패키지 는 sec0인데 상위디렉토리로 이동한후 sec1 디렉토리의 a.txt의 객체를 생성
		
		//파일의 절대 경로 지정
		File f3 =new File("d:"+File.separator+"Park"+File.separator+"Java2"+File.pathSeparator+"a.txt");
		String path ="d:\\park\\java2\\";
		File f4 =new File(path,"a.txt");
		File f5 =new File("d:\\park\\java\\","a.text");
	}
}
