package sec1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//FileNotFoundException : 해당 경로에 파일이 존재하지 않는 경우 발생하는 경우 발생하는 예외
public class ExceptionExam7 {

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
