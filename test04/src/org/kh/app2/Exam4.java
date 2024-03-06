package org.kh.app2;

public class Exam4 {

	public static void main(String[] args) {
		
			for(int i=1;i<=7;i++) {//for1
			if(i<=4) {
				for(int j=4-i;j>0;j--){//for2
					System.out.println(" ");
			}	
			for(int j=1;j<=2*i-1;j++) {
				System.out.println("*");				
			}
			
			}else {
				for(int j1=1;j1<i-3;j1++) {
					System.out.println(" ");
				}
				for(int j2=5;j2>i*2-10;j2--) {
					System.out.println("*");
				}
			}
					System.out.println();
		}
			
	}

}
