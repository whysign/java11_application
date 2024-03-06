package Exam;

public class Exam3 {

	public static void main(String[] args) {
		int[] obj = new int[5];
		int cnt =0;
		for(int i=1;i<=10;i++) { //2 4 6 8
			if(i%2==0) {
				obj[cnt] =i;//0->2
				cnt++; //1
			}		
		}
		int tot=0;
		for(int i=0;i<obj.length;i++) {
			tot+=obj[i];
												
		}
		System.out.println("1~10까지의 짝수합 :" +tot);
	}
}