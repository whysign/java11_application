package org.kh.app;

import java.util.Scanner;

// 조건문 if~elseif(~eles~)  (시험문제) 스캐너는 입력하기위해서 필요함 
public class Condition3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("점수 입력[0~100] :" );
	int point = scan.nextInt(); //문자열이면 next() 이렇게써준다
	char result;
	//학점은(result) 점수가(point) 90~100 이면 "A",89~80 이면 "B",
	// 70~79 ,"C" ,60~69, "D",60미만이면,"F"다
	
	if(point>=90) {
		result = 'A';
	} else if(point>=80) {
		result = 'B';
	}	else if(point>=70) {
		result = 'C';
	}   else if(point>=60) {
		result = 'D';		
	}  else {
		result = 'F';
	}
	
	
	System.out.printf("\n 당신의 점수는 %d점 입니다",point);
	System.out.printf("\n 당신의 학점은 %S점 입니다",point);
	}
}

	
	

	

