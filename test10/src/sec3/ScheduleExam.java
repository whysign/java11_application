package sec3;

import java.io.IOException;
public class ScheduleExam {

	public static void main(String[] args) throws IOException{
		//키보드로 알파벳
		Scheduler s= null;
		System.out.println("전화 상담 방식 선택 [A~Z] :");	
		int ch = System.in.read(); //문자 입력시 해당 문자의 아스키 코드 숫자로 형 변환하여 입력됨							
		
		if(ch=='p' || ch=='p') {
			s= new PriorityAllocation();			
		}else if(ch=='R' || ch=='r') {
			s= new RoundRobin();
		}else if(ch=='L' || ch=='l') {
			s= new LeastJob();
		}else {
			System.out.println("나머지는 출력이안됩니다");
		}
		

		s.getNextCall();
		s.sendCallToAgent();
  }
}
