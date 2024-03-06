package sec1;
class Outer3 { //외부클래스
	// 익명의 내부 클래스를 선언시키는 Runnable 로 구현 해야한다
	Runnable getRunnable(int i) {//Runnable은 인터페이스 이므로 인스턴스 생성시 기본 메소드인 run() 메소드의 구현내용을 기술해야함
		int num =100;	 	//지역변수		
		return new Runnable() {
			@Override
			public void run() {
				// int i;  => 매개 변수로 이미 상단에 i가있기떄문에 에러가생김
				//int num; => 지역 변수로 num이 상단에 있어서 에러가생김 중복되었기때문이다.
				System.out.println(i); //i => 매개 변수
				System.out.println(num);//num => 지역변수
			}		
		};		
	}	
	// 익명의 실행 인스턴스 를 Runnable 생성 
	Runnable runner =new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable로 구현된 익명의 내부 클래스 ~!");			
		}	
	};
}
public class AnonymousInnerExam {

	public static void main(String[] args) {
		Outer3 out =new Outer3();
		out.getRunnable(500); //오류는 없지만  Runnable이 만들어지지 않아 구현 내용은 실행이 안됨
		out.runner.run();
		
		
		 Runnable runAble =out.getRunnable(500); //외부 클래스의 내부 클래스 없이 생성된 인스턴스(Runnable)는  Runnable 갖고 함
		 runAble.run();
	}

}
