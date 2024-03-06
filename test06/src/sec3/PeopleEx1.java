package sec3;

public class PeopleEx1 {

	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum =200;				//People.selNum =200 와 동일 그뜻은 스태틱을 사용하면 p1.p2 이런변수들을 선언을안해도된다
		p1.name = "박은성";			//인스턴스 변수 == 동적필드  그이유는 객체를 선언하고 바꾸는것이기 떄문이다
		p1.age = 25;				
		p1.addr= "동두천";
		
		People p2 = new People();
		p2.selNum =300; 			//People.selNum =200 와 동일
		p2.name = "홍민석";
		p2.age = 25;
		p2.addr= "지행동";
		
		p1.selNum =400;
		
		System.out.println(p1.selNum+","+p1.name);
		System.out.println(p2.selNum+","+p2.name);
		
		p1.print1(); 
		p2.print1(); 
		
		p1.print2(); //People.print2()
		p2.print2(); //People.print2()
		//정적(static) 요소 : static으로 선언된 필드 또는 메소드
		//정적(static) 메소드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메소
		System.out.println("정적 메소드 == 클래스 메소드");
		People.print2();
		People.selNum =500;
		p1.print1();
		p2.print1();
		
	}

	
}
