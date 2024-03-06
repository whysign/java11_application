package sec5;
//Queue : FIFD(First In First Out) 구조 => 테스크(작업) 순서의 스케줄링
//Stack : LIFD(Last In First Out) 구조 => 최근 작업 목록
public class BookShelfExam {
	public static void main(String[] args) {
		Queue que = new BookShelf();
		que.enQueue("관악산 등산 경로");
		que.enQueue("경복궁 안내");
		que.enQueue("숭례문 명동 둘러보기");
		
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
		

	}

}
