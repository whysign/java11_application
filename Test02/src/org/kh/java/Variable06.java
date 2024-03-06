package org.kh.java;

public class Variable06 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor=90, ehg=80, mat=95;//실수는 이렇게 한번에 연결이가능하다 
		float avg = (kor + ehg + mat) /3.0f;
		System.out.printf("\nf1=%.3f",f1);
		System.out.printf("\nf2=%.2f",f2);
		System.out.printf("\n평균 : %.2f",avg );
		//사유 : kor ehg mat 모두 정수타입이라 정수/정수했기때문
		//해결법 : 셋 중 하나라도 or 뒷쪽에 나누는 숫자 3을 실수형으로 바꿔준다
		
	}

}
