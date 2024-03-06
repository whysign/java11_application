package sec2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		List<Student> sList =new LinkedList<>();
		
		
		Student s1 = new Student(); //첫번째방법
		s1.setNo(1);
		s1.setName("박은성");
		s1.setPoint(80);
		sList.add(s1);
		
		Student s2 =new Student(2,"김민준",100);//2번째 방법
		sList.add(s2);
		
		sList.add(new Student(3,"김병준",87));//3번째방법
		
		System.out.println("번호\t이름\t점수");
		for(Student s : sList) {
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
		}
		sList.add(new Student());
		sList.set(3, new Student(4,"김병수",92));
		// 실행이안되는이유 인덱스가없어서sList.set(3, new Student(4,"김병수",92));그래서 add를 추가한다
		
		System.out.println("번호\t이름\t점수");
		for(Student s : sList) {
			System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getPoint());
		}
		//ArrayList는 내용이 없는 인스턴스의 메모리가 그대로 차지 되고 있으나 근데 Vector는 내용이 없으면, 메모리에서 자동 제거 된다.
	}
}
