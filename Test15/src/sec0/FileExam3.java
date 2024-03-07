package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;  //17번재줄

//파일과 디렉토리 제어하는방법
public class FileExam3 {
	public static void main(String[] args) throws IOException {
		File f= new File("student");
		f.mkdir();	 //test15가 현재 디렉토리이므로 test15 안에 student라는 디렉토리 생성
		
		File f2 = new File("manage/teacher/kt");
		f2.mkdirs();
		
		//디렉토리 생성 날짜와 시간 변경하기 
		f.setLastModified(new Date().getTime());
		
		//디렉토리 읽기 전용   // 파일의 속성에 들어가서 읽기전용을 체크를안해도 이명령어를 사용하면 읽기전용 체크를 가능하게해주는 명령어
		f.setReadOnly();
		
		
	}
}
