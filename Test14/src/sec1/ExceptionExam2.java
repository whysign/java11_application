package sec1;
//NullPointerException : 출력할 문장이 있는 기억장소가 비어 있는경우
public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		//실제 처리할 문장(try)이 예외가 발생한면 , 예외처리 문장(catch)을 실행
		try {
			//실제 처리할 문장
			System.out.println(name.toString());
			System.out.println("정상처리 문장 아래");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "박은성";
			System.out.println(name+"\n예외처리 문장 아래");
		} catch(Exception e) {
			System.out.println("정체불가 예외발생");
		} 

	}

}
