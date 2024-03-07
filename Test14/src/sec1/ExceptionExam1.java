package sec1;
//Failure (고장): 시스템적인 이상으로 정상적으로 하드웨어나 소프트웨어가 동작하지못하는현상
//Error (오류): 프로그램 작업시에 코드의 문법적 구문 오류 개발자의 논리적 문장의 실수 드응로 인해 정상적인 동작을 못하는현상
// 구문오류 :
//Exception(예외): 고장이나  오류와 다르게 개발자의 잘못된 코딩으로 인해 정상적으로 처리 를못하는현상
//Mismatch(불일치) : 정상적인 결과와 다르게 결과가 표출되는 것으로 프로그램 코딩 상에 해당기능이나 구조에 
//예외 (Exception)처리 : 프로그래밍 로직상 에러가 발생하면,그 이후 의 처리 문장은 처리되지 못하고 ,실행이 안되는현상
//이러한경우를 예외 라고하며 , 그렇다면 , 다음 문장까지 실행될 수있도록
//계속 다음 문장도 처리 될수 있도록하는것을 예외처리라고한다.
//예외의 구분 : 

public class ExceptionExam1 {

	public static void main(String[] args) {		
		int data ;
		String name = null;
		//실제 처리할 문장(try)이 예외가 발생한면 , 예외처리 문장(catch)을 실행
		try {
			//실제 처리할 문장
			System.out.println(name.toString());
		} catch(Exception e) {
			//예외가 발생할 경우 처리할 문장
			System.out.println("알 수 없는 예외가 발생하였습니다.");
		}
	}

}
