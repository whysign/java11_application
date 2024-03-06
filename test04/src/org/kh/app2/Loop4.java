package org.kh.app2;

import java.util.Scanner;

public class Loop4 { //1
// while(조건식)  반복할문장  조건이 만족하는동안 반복시행을 함 (for와마찬가지)
// 그러나 while의 괄호는 조건만 기입하고, 해당 블록 안에 증감식이 기재됨 초기식의 while문 시작전에 들어감
// while(조건식) {
//	    증감식;
//      반복할문장;
//       }	
	public static void main(String[] args) { //2
		 int i = 0, tot=0 ;
		 while(i<=10) { //while  (1대입) (2대입)  (3대입) ....   
			i++;  // i=i+1  //     1      2		  3	  ....
			tot+=i;//tot=tot+i //  1      3       6   ....			 					 			 			 
		}
		 System.out.println("결과 :" +tot);
		 //해당 숫자를 입력하면,구구단 중 해당 숫자의 단을 출력하시오.
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자 입력 [2~9] :");
		 int n = sc.nextInt();
		 
		 int j = 0;
		 while(j<10) { //while
		  j++;
		  System.out.println(n+ " x " +j+" = "+(n*j));
		 }	 
   }//2
 
}//1
