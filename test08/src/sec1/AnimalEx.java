package sec1;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal();
		Animal a3 = new Birds();
		
		//Mammal m1 = new Animal (); << 이건안된다 다른구조이기떄문이다
		Mammal m2 = new Mammal();
		
		Animal a4; //선언
		a4 = new Animal(); //Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		System.out.println(a4.print());
	
		a4 = new Mammal(); //Mammal 객체로 형변환
		//a4.setLegs(4);  <<안되는이유는 클래스를 Animal로 선언했기때문이다
		a4.setName("호랑이"
				+ "");
		System.out.println(a4.print());
		
		a4 = new Birds(); //Birds 객체로 형변환
		//a4.setWings(0); <<안되는이유는 클래스를 Animal로 선언했기때문이다
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		
		
		//메소드 오버라이딩: 부모 클래스로 부터 상속 받은 메소드를 다르게 구현 <<포인트
		//그러므로, 부모 클래스로 선어된 객체는 부모 자신 또는 자식 생성자를 활용하여 
		//다양하게 형 변환 할 수 있음 => 다형성 이라고한다
		//클래스 => 캡슐화 , 정보 은닉 , 재사용성, 다형성
	}

}
