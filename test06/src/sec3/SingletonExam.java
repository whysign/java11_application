package sec3;

public class SingletonExam {  //싱글톤 클래스 아무리 코드를 찍어내도 결과값이 하나로 지정되어있는 싱글톤 클래스타입이다 !매우중요!

	public static void main(String[] args) {
	 Singleton a1 = Singleton.getInstance();
	 Singleton a2 = Singleton.getInstance();
	 Singleton a3 = Singleton.getInstance();
	 System.out.println(a1);
	 System.out.println(a2);
	 System.out.println(a3);
	 System.out.println((a1==a2)+":"+(a1==a3));	 		
	}

}
