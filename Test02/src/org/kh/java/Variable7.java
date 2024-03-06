package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "박은성";
		Integer age = 25;
		String age2 = "25";
		int age3 = Integer.parseInt(age2) +8;
		Float height = 180.8f;
		String height2 = "180.8";
		float height3 = Float.parseFloat(height2);
		//boolean pass = true;
		Double weight = 97.7;
		System.out.println("age:" +age3);
		System.out.println("name:"+name.getClass().getName());
		System.out.println("age:"+age.getClass().getName());	
		System.out.println("height:"+height.getClass().getName());
		System.out.println("weight:"+weight.getClass().getName());
		//primitive type =>Wrapper type = boxing
		//Wrapper type =>primitive type = unboxing
	}

}
