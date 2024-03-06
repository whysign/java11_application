package sec1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//중첩 예외 처리 : try~catch 문장안에  try~catch가 이중으로 기재되는 경우
//주의사항 :
public class ExceptionExam8 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream ois = null;	
		try {
			fis =new FileInputStream("indata.txt");
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을수없습니다");
		} catch(Exception e) {
			System.out.println("원인불명");
			e.printStackTrace();
		}finally {
			System.out.println("파일 처리 종료");
		}
	}

}
