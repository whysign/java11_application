package sec1;

import sec2.Animal;
import sec2.Mammal;
import sec2.Birds;

public class AnimalEx2 {

	public static void main(String[] args) {
		Animal a1 ; // Animal 객체 선언
		a1= new Animal();
		a1.setName("호랑이");
		a1.setSpine(true);
		System.out.println(a1.print());
		
		a1 =new Mammal();
		a1.setName("사자");
		System.out.println(a1.print());
		
		a1= new Birds();
		a1.setName("비둘기");
		System.out.println(a1.print());

	}

}
