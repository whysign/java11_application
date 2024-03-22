package creational;
//FatoryMethod 패턴 : 객체를 만드는 부분을 서브 클래스(Sub Class)에 위임하는 패턴
//Fatory 클래스를 활용하여 Sub Class인 IDCardFactory를 만든다.
//신분증(IDCard)를 만드는 공장(IDcard)을 활용
//
public class FatoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.creat("박");
		Product card2 = factory.creat("김");
		card1.use();
		card2.use();
		
	}
}
