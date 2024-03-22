package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Member;

public class MemberExam {

	public static void main(String[] args) {
		List<Member>mb=new ArrayList<>();
		MemberExam app =new MemberExam();
		app.mainCall();
	}
	public void mainCall() {//1.회원가입 2.회원목록 3.회원삭제 4.프로그램종료
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.회원목록");
			System.out.println("3.회원삭제");
			System.out.println("4.프로그램 종료");
		
		}
		
	}
}
