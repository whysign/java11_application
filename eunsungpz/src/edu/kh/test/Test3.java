package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
public class Test3 {
	public static void main(String[] args) {
		List<Integer>List =new ArrayList<>();//List<Integer> List =null;  첫째오류 :list 선언만 있으므로 객체 생성이 되어 있지 않아 NullPointerException이 발생
		List.add(4);
		List.add(-5);
		List.add(0);
		List.add(-3);
		List.add(2);
		List.add(1);//List.add(1.23456); 두번째 오류 : List의 선언시 요소의 데이터타입의 Integer로 설정되어있으므로 정수만 입력가능하므로 데이터 타입 오류가 생김 .
		
		for(int num :List) {
			char ch;
			
			if(num<0) {	//if(num<=0) 세번째 오류 : if 문의 조건에서 0을 포함하여 음수라고  표현 했으므로  0이여도 음수가 발생하고 ,0인 경우의 정상적으로 처리되어야할  else문이 실행되지 않는 오류 발생 
				ch='-';
			}else if(num>0) {
				ch='+';
			}else {
				System.out.println("@@@@@@@");
				continue;
			}
			//int math.abs(num)(정수): 정수의 절대값을 반환
			for(int i=1 ; i<=Math.abs(num);i++) {//for(int i=1 ; i<Math.abs(num);i++) 4번째 오류 :for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아닌 작을 때까지만 실행하게 되어 해당 숫자의 횟수 만큼 부호를 출력해야 되는데 한 번씩 덜 출력됨 
				System.out.println(ch); // +++ ----
			}
			System.out.println();
		}
	}
}
