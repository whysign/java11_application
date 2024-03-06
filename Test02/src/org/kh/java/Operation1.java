package org.kh.java;
//명령(연산) => Operation(opcode+operand) :0주소방식~3주소방식
//입력 항에 따라 :단항(Unary), 이항(Binary), 삼항(ThreeFlow) !는연산자
public class Operation1 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = !b1; //!b1 << 하나 씩있는걸 단항연산
		int i1 =70 , i2=60;
		int i3 = i1 + i2; // 입력항이 2개이기때문에 이항연산
		int max = (i1 < i2)? i1 : i2; // 이렇게 3개로나눠지기때문에 삼항 연산
		System.out.println("b1 :" +b1);
		System.out.println("b2 :" +b2);
		System.out.println("i3 :" +i3);
		System.out.println("max :" +max);
		
	}
	

}
