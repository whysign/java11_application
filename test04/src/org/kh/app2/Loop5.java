package org.kh.app2;
// do~while~
public class Loop5 {//1

	
	public static void main(String[] args) { //2
		int a=0;
		while(a>10) { //while
			a++;
			System.out.println("a="+a);
			
		}
		// do~while~:조건이 만족하지 않더라고 1회이상 실행을 보장하는 문장
		do {  //do
			System.out.println("a=" +a);
				   	
	    }   while(a>10);
		
		for(int i=10;i>0;i--) {//for (순차적으로 감소 시키는문 역 for문이라고한다)
			System.out.println("i="+i);			
		}
				
		int b = 0;
		for(;;) { //for
			b++;
			System.out.println("b="+b);
			if(b>10) break;			
		}
		int tot =0;
		for(int j=0;j<=100;j++) { //for2 //0~100 짝수의 합 
			if(j%2==1) continue; //continue <ㅡ 건너뛰기
			tot+=j;			
		}
		System.out.println("tot :"+tot);
		
		int hap = 0;
		for(int k=0;k<=100;k+=2) {//for3
			hap+=k;						
		}
		System.out.println("hap :" +hap);
		
	}//2
}//1
