package sec2;

public class OverloadEx2 {
	public static void main(String[]args) {
		Board b1 = new Board() ;//매개변수가 없는 방식으로 b1객체 생성
		b1.setBno(1);
		b1.setTitle("코딩박사");
		b1.setUser("기");
		b1.setAuthor("hello");
		b1.setContent("가");
		b1.setVisited(122);
		Board b2 = new Board() ;//bno가 있는 방식으로 b2객체 생성
		b2.setBno(2);
		b2.setTitle("코딩박");
		b2.setUser("기ㄴ");
		b2.setAuthor("he5llo");
		b2.setContent("가5");
		b2.setVisited(1222);
		Board b3 = new Board(142,"코딩밤");
		b3.setBno(3);
		b3.setTitle("코딩박사");
		b3.setUser("기1");
		b3.setAuthor("hello");
		b3.setContent("가");
		b3.setVisited(1221);
				
	}
}
