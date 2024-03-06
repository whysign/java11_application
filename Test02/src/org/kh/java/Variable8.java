package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {
		//가변할당(동적 할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자유롭게 변형됨
		// 아래와 같이 메모리가 다 다르기 때문에 동적 할당이라고 한다.
		var num1 = 29.456;
		var num2 = 34;
		var num3 = 'p';
		var num4 = "박은성";
		var num5 = true;
		num1 =67;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		System.out.println("num4:"+num4);
		System.out.println("num5:"+num5);
		
	}

}
