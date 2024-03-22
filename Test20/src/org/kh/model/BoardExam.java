package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Board;

public class BoardExam {

	public static void main(String[] args) {
		List<Board>bdList =new ArrayList<>();
		for(int i=1;i<=10;i++) {
			Board bd =new Board(i,i+"¾Ó",i+"Ç×",i+"Èþ", i+"Çâ", i);
			bdList.add(bd);
		}
		for(Board b:bdList) {
			System.out.println(b.toString());
		}
	}

}
