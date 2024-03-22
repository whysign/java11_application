package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<String>nameList =new ArrayList<String>();
	while(true) {
		System.out.println("추가할이름 추가");
		String name =sc.next();
		if(name.equals("clear") ) { //1번째 오류 ==이 아니라 .equals 를사용해야함
			System.out.println("이름목록을 초기화");
			nameList.clear();//2번째 오류 continue가 앞으로 가면 초기화됨 그래서 맨뒤에 써줘야함.
			continue;
		}
		if(name.equals("exit")) {		
			System.out.println("입력종료");
				break; //exit가 입력될 경우 아래 출력 문장을 main함수의 밖으로 탈출해버린다그렇기때문에 return이아니라 break를사용해야한다..3번째오류
		}
		if(nameList.contains(name)) {
			System.out.println("이미존재하는이름");
		}else {
			nameList.add(name);//4번째오류 이름 목록에(nameList)이름을 추가하는 구현 코드의 누락으로 인해 추가하지 못함 .
			System.out.println(name+"추가 완료");
		}
	  }  
   }
}
