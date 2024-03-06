package sec1;

public class ExceptionExam4 {

	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "park0722";
		try {					
		int val1 =Integer.parseInt(data1);
		int val2 =Integer.parseInt(data2);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+20);
		} catch(NumberFormatException e) {
			System.out.println("숫자형식으로 처리 불가능 한 데이터");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("정체 를 알수없는 예외");
			e.getMessage();
		}finally {
			System.out.println("종료");
		}
		
		
	}
}
