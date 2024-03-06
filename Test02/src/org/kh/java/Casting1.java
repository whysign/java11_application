package org.kh.java;
//형 변환 (Auto Casting,Force Casting)=type conversion
public class Casting1 {

	public static void main(String[] args) {
		//오토 캐스팅) 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소를 옮겨지면서 타입이다
		byte b = 20; //1byte
		short s = b; //2byte byte->short
		int i = s;   //4byte short->int
		long l = i;  //8byte int->long
					//int i2 = l; <<불가능
		//Force Casting 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를활용하여 쓰는것
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
		
	}

}
