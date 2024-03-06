package org.kh.app2;
//반복문 : for , while, do~while~
public class Loop1 {//끝마무리와 같은 것
	public static void main(String[] args) { //1
		int n = 0;
		/*
		  int n =0;
		  n= n + 1;
		  n= n + 1;
		  n= n + 1;
		  n= n + 1;
		  n= n + 1;
		  n= n + 1;
	      n= n + 1;
		  n= n + 1;
		  n= n + 1;
		  n= n + 1;
		 */
		//조건식이 참 일떄 동안만 반복수행한다
		//for 기본식 (초기식;조건식;증감식){반복해야할문장;}
		// 
		for(int i=0;i<10;i++) {//0 1 2 3 4 5 6 7 8 9  //2 
		 n = n + 1;  // i=0 일때 n=1 2 3 4 5 6 7 8 9 10
		 			
	    } //2
		System.out.println("n=" +n);
		int[] nums = {80,95,75,60,100,65,70,90,85,95};//배열
		String names[] = {"김","이","박","최","정","오","배","강","장","계"};
		int tot = 0;
		int max = 0;
		int min = nums[0];
		System.out.println("nums :"+nums);
		System.out.println("names :"+names);
		System.out.println("\n이름\t점수\t학점\t판정");
		for(int i=0;i<10;i++) {//3
			tot += nums[i]; // tot = tot + nums[i]
			System.out.print(names[i]+"\t ");
			System.out.print(nums[i]+"\t");
			
			if(nums[i]>=90) {
				System.out.print("A\t"); 		
			}  else if(nums[i]>=80) { // else if 1
				System.out.print("B\t");
			}  else if(nums[i]>=70) {  // else if 2
				
				System.out.print("C\t");
			}  else if(nums[i]>=60) {   // else if 3
				System.out.print("D\t");
			}  	
		 if(nums[i]>=70) {
			 System.out.print("합격\n");
		    } else {  //else 1
			  System.out.print("탈락\n");  
		    }
		 if(nums[i]> max) max = nums[i];
		 if(nums[i]< min) min = nums[i];
			
		}//3
		System.out.println("전체 총점 :" + tot );
		System.out.println("전체 평균 :" + (tot/10.0f));
		System.out.println("최대 점수 :" + max);
		System.out.println("최소 점수 :" + min);
     }//1
  }//끝마무리
