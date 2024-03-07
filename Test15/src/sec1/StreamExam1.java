package sec1;
// 파일/키보드/데이터 입력 :FileInputStream ,BufferedInputStream,FileReader,BufferedReader
// 파일/모니터/데이터 입력 :FileOutputStream,BufferedOutputStream,FileWriter,BufferedWriter
//Stream 으로 끝나는 클래스는 데이터 입출력을  바이트 단위로 :FileInputStream ,BufferedInputStream,FileOutputStream,BufferedOutputStream
//Stream 으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 :FileReader,BufferedReader,FileWriter,BufferedWriter
public class StreamExam1 {
	public static void main(String[] args) {
		String fileInputStream = "FileInputStream는 바이트 단위로 입력하기 위한 스트림";
		String bufferedInputStream = "BufferedInputStream 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼후 로딩후";
		String FileReader = "FileReader 문자단위로 입력하기 위한 스트림";
		String BufferedReader ="BufferedReader 문자 단위로 입력하기 위한 스트림 :메모리 버퍼로 로딩후";
		String FileOutputStream ="FileOutputStream 바이트 단위로 입력하기 위한 스트림";
		String BufferedOutputStream =" BufferedOutputStream 바이트 단위로 입력하기 위한 스트림 :메모리버퍼로 로딩 후";
		String FileWriter =" FileWriter 문자 단위로 입력하기 위한 스트림";
		String BufferedWriter ="BufferedWriter 문자 단위로 입력하기 위한 스트림:메모리버퍼로 로딩 후";
		System.out.println(fileInputStream);
		System.out.println(bufferedInputStream);
		System.out.println(FileReader);
		System.out.println(BufferedReader);
		System.out.println(FileOutputStream);
		System.out.println(BufferedOutputStream);
		System.out.println( FileWriter);
		System.out.println(BufferedWriter);
		
	}

}
