package org.kh.java;

public class Constant1 {

	public static void main(String[] args) {
		//상수(Constant)와 리터럴(Literal)
		final int Max_point = 100;
		final int Min_point = 0;
		final double PI = 3.14592;
		final String MY_NAME = "박은성";
		// MY_NAME = "박은성 " 상수는 값 변경을할수가없다.
		//위와 같이 final 지시자가 선언되고, 대문자로 표기된것을 상수라고 하며,
		//항상 값이 같아 더 이상 변할 수 없는 값을 뜻함
		//변수나 상수에 대입되는 값을 리터럴(Literal)이라고한다.
		//2진수,10진수,8진수,16진수,정수,실수,문자,문자열 <<리터럴이라고함
		System.out.println("최소점수" +Min_point);
		System.out.println("최고점수" +Max_point);
		System.out.println("나의이름 = " +MY_NAME);
		System.out.println("반지름이 10인 원의 둘레 길이" +(10*2*PI));
		
	}

}

