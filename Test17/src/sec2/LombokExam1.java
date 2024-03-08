package sec2;

public class LombokExam1 {
	public static void main(String[] args) {
		Member mem1 =new Member();
		mem1.setId("pes");
		mem1.setPw("1123");
		mem1.setPoint(90);
		System.out.println(mem1.toString());
		Board bd =new Board();
		bd.setBno(10);
		bd.setTitle("¾È³ç");
		bd.setContent("±×·¡");
		bd.setViewCnt(14);
	}
}
