package sec1;

public class Student03 {
	int mat;
	int eng;
	int kor;
	int num;
	
	
	
	int tot() {
		return(this.kor+this.eng+this.mat);
		
	}
	double avg() {
		return(this.kor+this.eng+this.mat)/3.0f;
		
	}
	public void print() {
		System.out.println("이름 :"+this+"\n총점:);
		
	}
	
	
	public Student03(int mat, int eng, int kor, int num) {
		super();
		this.mat = mat;
		this.eng = eng;
		this.kor = kor;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Student03 [mat=" + mat + ", eng=" + eng + ", kor=" + kor + ", num=" + num + "]";
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
