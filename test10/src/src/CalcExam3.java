package src;

public class CalcExam3 {

	public static void main(String[] args) {
		Repeator rep1;
		int num1 =100;
		int num2 = 3;
		// 자식 클래스로 선언된 인스턴스(객체)는 부모 생성자로 생성 불가능		
		// rep1 = new Calcurator();
		
		// rep1 = new Repeator(); 안되는이유는 Repeator가 추상 클래스이므로 
		// 내부에 추상 메소드가 존재하고 있어 구현 내용이 없으므로 생성할수없음
		
		rep1 = new Arithmatic();
		
		//rep1은 Repeator로 선언되어 있으므로 Repeator에는print()에 선언되어 있지 않아 사용 불가
		//rep1.print();
		
		System.out.println("덧셈 :" +rep1.add(num1, num2) );
		System.out.println("뺼셈 :" +rep1.subtract(num1, num2));
		System.out.println("곱셈 :" +rep1.multiply(num1, num2));
		System.out.println("나눗셈 :" +rep1.divide(num1, num2));
		System.out.println("거듭제곱 :" +rep1.power(num1, num2));						
	}

}
