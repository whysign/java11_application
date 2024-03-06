package sec3;

public class People {
	public static int selNum = 100; //고유번호 static 정적필드가 되버림 [정적이란 공유데이터를 의미한다.그리고 모든데이터를 공유를받고있기떄문]
									//객체와 관계업이 메모리가 공유된다[static 위에 추가설명]
	public String name;//이름
	public int age;//나이
	public String addr;//주소
	
	public void print1() {
		
		System.out.println("selNum :" +this.selNum);
		System.out.println("name :" +this.name);
	}
	
	public static void print2()  {    //static 메소드에는 this 를 사용불가능하다
		 System.out.println("Name : 아무개 " );
		 System.out.println("Name : 25 " );
			
		 
	}
	
}
