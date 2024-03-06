package org.kh.app2;

import java.util.Random;

public class Loop07 {
	public static void main(String[] args) {
		int min =1 ,max=45;
		Random k = new Random();
		for(int j=0;j<6;j++)
		{
			int y =k.nextInt(max + min) +min;
			
			System.out.println(y+"\t\n") ;
			
		}
		
    }
}