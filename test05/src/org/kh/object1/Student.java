package org.kh.object1;

public class Student {
		String name;
		int kor;
		int eng;
		int mat;
		 int tot() { //int
			return (this.kor+this.eng+this.mat);
					
		}
		double avg() { //double
			return (this.kor+this.eng+this.mat) / 3.0f;			
		}
		void resulting() {//void
			System.out.println("이름 :"+this.name+" \n총점 : "+this.tot()+"\n평균 : "+this.avg());
				
		}
}
