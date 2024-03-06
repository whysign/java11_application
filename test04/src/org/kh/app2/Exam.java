package org.kh.app2;
//operator 값이 " + , - , * , / " 인 경우에 사칙 연산을 수행하는 프로그램을
// if~else if문과  switch ~case~문을 사용해 작성해보세요
public class Exam {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 4;
		char operator = '+';
		
		
		int result = 0;	 	 
		switch(operator) {
		 case'+':
		 	result =num1 +num2;
		 	break;
		 case '-':
			 result =num1 -num2;
			break;
		 case '*':
			 result = num1*num2;
			 break;
		 case '/':
			 result =num1/num2;
			 break;
		default:
			System.out.println("연산 오류");			 
		}
		
		
	}

}
