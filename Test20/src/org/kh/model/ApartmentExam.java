package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Apartment;

public class ApartmentExam {

	public static void main(String[] args) {
		List<Apartment> aptList =new ArrayList<>();
		for(int i=1;i<=10;i++) {
			Apartment apt =new Apartment("ぞし"+i,"ぞし1"+i, i, i, i, 1.0);
			aptList.add(apt);
		}
		for(Apartment a:aptList) {
			System.out.println(a.toString());
		}
	}

}
