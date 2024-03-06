package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "\'박은성\'";
		short age = 25;
		float height = 180.8f;
		double weight = 97.7d;
		char init = 'p'; //문자를 저장할때는 작은따음표
		
		System.out.printf("%n이름 : \" %s\"",name);
		System.out.printf("%n나이 : %d",age);
		System.out.printf("%n키 : %f",height);
		System.out.printf("%n체중 : %.3f",weight);
		System.out.println("\n이니셜 :"+init);
		
		/* 이스케이프 문자 
		  \n : 줄바꿈
		  \t : 탭
		  \\ : \를 출력
		  \": "를 출력
		  \':'를 출력
		  .<-들어가면 소수점을이용할수있다
		 */

	}

}
