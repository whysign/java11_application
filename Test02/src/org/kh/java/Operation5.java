package org.kh.java;
//관계연산자(비교연산자) : ==,!=,>(초과),>=(이상),<(미만),<=(이하) --->결과적으로 true,flase 가 도출된다
public class Operation5 {

	public static void main(String[] args) {
		int a = 25;
		int b = 28;
		int c = 27;
		
		System.out.println("a 와 b가 같습니까? "+(a==b));
		System.out.println("a 와 b가 다릅니까?"+(a!=b));
		System.out.println("a 가 b보다 큽니까?"+(a>b));
		System.out.println("a 가 b보다 크거나같습니까?"+(a>=b));
		System.out.println("a 가 b보다 작습니까?"+(a<b));
		System.out.println("a 가 b보다 작거나같습니까?"+(a<=b));		
	}

}
