package org.kh.app;
//조건문 if~else~: if(조건식) {조건이 참일떄 실행문;} else{ 조건이거짓일때실행문;}
public class Condition2 {

	public static void main(String[] args) {
		char se1 = '1';
		//성별코드 (se1)가 1이거나 3이면, "남성" , 아니면, "여성"
		String gender;
		if(se1=='1' ||  se1=='3') {
			gender = "남성";
			
		} 
		

		 else gender = "여성";
			 
		
		System.out.printf("%n당신의 성별은%s", gender);
		
	}
	

}
