package org.kh.java;
//증감 연산 : ++ ,-- => 전위 연산, 후위 연산이 각 각 있음
public class Operation {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		//a++ => a = a + 1 <<전위 ,후위증가는 먼저 결과값을 도출하고 다음에 더하고,뺸다
		System.out.println("전위 증가 연산 :" +(++a)); //11,a를 먼저 1씩 증가시키고, 난 후에 출력
		System.out.println("후위 증가 연산 :" +(b++)); //10,b를 먼저 출력하고,나중에 1씩 증가시킨다
		System.out.println("전위 감소 연산 :" +(--a)); //10,a를 먼저 1씩 감소시키고, 난 후에 출력시킨다
		System.out.println("후위 감소 연산 :" +(b--)); //11,b를 먼저 출력하고, 나중에 1씩감소시킨다
		System.out.println("a =" +a);
		System.out.println("b =" +b);

	}

}
