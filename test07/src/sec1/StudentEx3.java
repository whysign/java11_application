package sec1;

import java.util.ArrayList;
import java.util.List;
public class StudentEx3 {

	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();//목록
		for(int i=0;i<5;i++) {
			Student st =new Student();// 한 명의 학생 객체
			st.setNo(i+1);
			System.out.print((i+1)+"번쨰 국어 :");
			st.setKor(scn.nextInt());
			System.out.print((i+1)+"번쨰 영어 :");
			st.setEng(scn.nextInt());
			System.out.print((i+1)+"번쨰 수학 :");
			st.setMat(scn.nextInt())l
			s.add(st);
		}
		for(Student t:s) {
			
		}
	}

}