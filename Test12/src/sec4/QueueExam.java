package sec4;

import java.util.LinkedList;
import java.util.Queue;
// Queue : First In First Out ->선입선출 : 먼저 입력한 데이터가 먼저 출력되는 자료 구조
// 자바에서는  Queue가 인터페이스 이므로 같은구조를가진 LinkedList를 이용하여 생성한다.
public class QueueExam {

	public static void main(String[] args) {
		 Queue<String> q = new LinkedList<>();
		 q.offer("아");
		 q.offer("뉴");
		 q.offer("케");
		 q.offer("에");
		 q.offer("여");
		 q.offer("르");
		 System.out.println(q);
		 System.out.println(q.peek()); //맨 처음 데이터 검색 변환
		 System.out.println(q.peek());
		 System.out.println("peek 후의"+q);
		 System.out.println(q.poll()); //맨 처음 데이터 변환후 제거
		 System.out.println(q.poll());
		 System.out.println("poll 후의"+q);
		 System.out.println(q);
		 
	}

}
