package sec1;
//BufferedInputStream : 바이트단위 
//직렬화 : Serialization(Serialize) => Externailization
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class BufferedInputStreamExam1 {
	public static void main(String[] args)	throws IOException {
		BufferedInputStream input =null;
		try {
			input = new BufferedInputStream (new FileInputStream ("a.txt"));
			while(input.available()>0) {
				System.out.println((char)input.read());
			}
		}catch(Exception e) {
			System.out.println("파일읽기실패");
		}finally {
			if(input !=null) {
				try {
					input.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}