package sec1;
//내부 클래스(InnerClass) : 클래스 안에 더 작은 클래스
class Outer{//외부클래스
	private int num =10;
	private static int snum =20;
		
	public Inner inner; // 인스턴스 내부 클래스
	public Outer() { //Outer 생성자를 호출하게 되면 , 자동적으로 내부클래스에 대한 인스턴스 생성
		inner = new Inner();
	}		  // 7~10번 줄 기억하기 
	
	
	
	class Inner{ //내부클래스
		int inNum = 1000;
		void inMethod() {
			System.out.println("내부클래스에서 외부클래스의 멤버 변수 : num " +num);
			System.out.println("내부클래스에서 외부클래스의 정적 멤버 : snum " +snum);
		}
	}
	public void outMethod() { // 외부 클래스에서 내부 클래스의 메소드 호출
		inner.inMethod();
	}
}
public class InnerClassExam {
	public static void main(String[] args) {
		Outer out =new Outer();
		out.outMethod();  		//타 클래스에서 객채 생성 후 외부 클래스의 멤버 메소드 호출
		out.inner.inMethod();  	//타 클래스에서 객체 생성 후 내부 클래스의 멤버 메소드 호출
	}

}
