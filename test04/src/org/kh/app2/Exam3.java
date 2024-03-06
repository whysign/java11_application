package org.kh.app2;
//구구단을 단보다 곱하는 수가 작거나 같은 경우만 출력하는 프로그램
public class Exam3 {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
		for(int j=1;j<10;j++) {
			if(j<i) continue;
			System.out.println(i+"*"+j+"="+i*j);
		}
			System.out.println();
		}

	}

}
