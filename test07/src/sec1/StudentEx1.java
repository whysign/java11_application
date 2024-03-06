package sec1;

import java.util.Scanner;

public class StudentEx1 {

	public static void main(String[] args) {
		//5명의 학생 객체 선언 
		Student[] s =new Student[5];
		Scanner scn =new Student[System.in];
		for(int i=0;i<5;i++) {
			s[i]=new Student();
			s[i].setNo(i+1);
			System.out.print((i+1)+"번쨰 국어 :");
			s[i].setKor(scn.nextInt());
			System.out.print((i+1)+"번쨰 영어 :");
			s[i].setEng(scn.nextInt());
			System.out.print((i+1)+"번쨰 수학 :");
			s[i].setMat(scn.nextInt())
			
					
		}

	}

}
