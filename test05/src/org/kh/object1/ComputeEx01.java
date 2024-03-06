package org.kh.object1;
//메소드 (method):정의-> 호출
public class ComputeEx01 {
	public static void main(String[] args) {
		Compute01 comp1 =new Compute01();
		comp1.fnc1();
		comp1.fnc2(200);
		int a = comp1.fnc3();
		System.out.println(comp1.fnc3());
		System.out.println(a);
		String pass = comp1.fnc4(70);
		System.out.println(pass);	
		fnc1();
		fnc2(500);
		System.out.println(fnc3());
		System.out.println("원의 넓이 :" +fnc4(25));
	}
	//함수(Function) :정의 호출
	public static void fnc1() {
		System.out.println("반환(x),매개 변수(o)");		
	}
	public static void fnc2(int a) {
		System.out.println("입력 수 :"  +a);		
	}
	public static int fnc3() {
		return  500;		
	}
	public static double fnc4(int x ) {
		return x*x*3.1454f;
		
	}
}
