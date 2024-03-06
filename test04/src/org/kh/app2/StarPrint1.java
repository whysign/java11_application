package org.kh.app2;
//중첩 for문을 활용한 별 찍기 
public class StarPrint1 {//1
	public static void main(String[] args) {//2
		/*
		  
		 * 
		 **
		 ***
		 ****
		 *****
		 ******
		 */
		for(int i=0;i<6;i++) {//for1
			
			for(int j=0;j<i+1;j++){//for2
					
				System.out.print("*");		
				
			}
			System.out.println();			
		}
		for(int i=6;i>=0;i--) {//for3
			for(int j=0;j<i+1;j++) {//for4
				
				System.out.print("*");
			}
			System.out.println();
		}
	}//2
	

}//1

