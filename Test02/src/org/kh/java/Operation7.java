package org.kh.java;
//대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, |= ,>>=, <<=, >>>=, <<<=
//비트 연산자 : %(and), |(or) , ~(complemet(not)) , ^(xor),>>같다>>>(right Shift),<<같다<<<(left Shift)
public class Operation7 {

	public static void main(String[] args) {
		int a  = 20; 
		int b  = 15;
		int tmp;
		a += b;  //a=35 , b= 15
		b -= a; // a=35 , b= -20  (b=b-a)  << 저 값을 뒤집고 싶으면 임시기억장치(tmp) 를사용한다
		// a와b의 값을 맞교환
		System.out.println("a="+a);
		System.out.println("b="+b);
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("******교환후******");
		System.out.println("a="+a);
		System.out.println("b="+b);
		// 비트(2진수)연산자	
		int x = 0b01101;  // x= 1101 y=1011	
		int y = 0b01011;  // x & y = 1001 , x | y = 1111
		System.out.println("x="+Integer.toBinaryString(x));
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x & y : "+Integer.toBinaryString(x & y)); //and
		System.out.println("x | y : "+Integer.toBinaryString(x | y)); //or
		System.out.println("x ^ y : "+Integer.toBinaryString(x ^ y)); //xor <= 서로입력이 다를경우 <2진수연산
		System.out.println("~x"+Integer.toBinaryString(~x)); //Integer=4바이트,32비트
		System.out.println("x >> 2 :"+Integer.toBinaryString(x >> 2)); // right shift 2진수로 했으니 >>2 라는 뜻은 2진수 결과값에서 뒤에서부터 2번 없애준다
		System.out.println("x << 2 :"+Integer.toBinaryString(x << 2)); // left shift  왼쪽이니까 추가해준다 00
		System.out.println("******대입 연산자*******");
		
		// 16 8 4 2 1
		// 1  1 0 0 1 << i  
		// 1  1 1 1 0 << j
		// 1  1 0 0 0  << & 계산 ,  11111 < or 계산
		// 16+8 = 24  아래 식
		int i = 25;
		int j = 30;
		i &= j; // i = i & j
		System.out.println("i &= j " +i  ); // 식이맞아야하는경우 결과값: 24
		i = 25;
		i |= j;
		System.out.println("i |= j " +i  ); // 11 111 <하나라도 같은경우는 1 결과값:31
		i = 25;
		i ^= j;
		System.out.println("i ^= j : " +i  ); // ^ <서로다를경우 결과값: 7
		
		
		j >>= 2;  //1 1 1 1 0
		System.out.println("j >>= 2 : " +j  ); // 결과값: 7
		
		
		j = 30;
		j <<= 2; // 1 1 1 1 0
		System.out.println("j <<= 2 : " +j  ); // 결과값: 120
		
		j = 30;
		j >>>= 2;
		System.out.println("j >>>= 2 : " +j  ); // 결과값: 7	
	}
}
