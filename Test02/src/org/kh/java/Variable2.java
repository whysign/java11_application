package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {
		byte b= 10;		//선언(o),초기화(x)
		short s = 20;
		int i;   //선언(o),초기화(x) => 그냥출력시 Null Pointer 오류를 일으킴
		long l;
		i = 30; //초기화
		l = 40L; //초기화
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		//b = 130; << 출력될수없다 이유는: overflow 숫자가 초과 b는byte라서
		//b = -130; << 출려될수없다 이유는: underflow 숫자가 미만
	}

}
