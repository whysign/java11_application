package sec4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//set : 값만 저장 , 중복 허용x ,순서유지x
//set 종류 : HashSet,TreeSet
public class SetExam {

	public static void main(String[] args) {
		// set의 선언 및 생성 
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();
		
		set1.add("박은성");
		set1.add("김대중");
		set1.add("12");
		set1.add("22");
		set1.add("33");
		set1.add("44");
		set1.add("55");
		set1.add("66");
		set1.add("77");
		System.out.println("요수"+set1.size());
		System.out.println(set1);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("이름이 존재함");
		}else {
			set1.add(name);
			System.out.println("\n"+name+"입력완료"); 
		}
		
		//특정 요소 삭제
		
		//비우기
		if(set2.isEmpty()) {
			System.out.println("s2가비어있다");
		}else {
			set1.add(name);
			System.out.println("s2요소수: "+set2.size()); 
		}
		
		
		
		
		
		
		
		
	}

}
