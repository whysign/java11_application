package org.kh.app2;

public class Loop03 { //1

	public static void main(String[] args) { //2
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		// 중요한 자바 1.6이상의 개선된 for문
		for(int i : nums)
		
		{		
			if(i>=80)	System.out.println(i+ "합격" );
			else System.out.println(i
					+ "불합격" );
         }  
		for(int i=0;i<nums.length;i++)
		    System.out.println("i="+nums[i]);

		
		
		
		
		
			
		}//2

}//1
