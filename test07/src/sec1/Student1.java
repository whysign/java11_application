package sec1;

public class Student1 {
	private int kor ;
	private int mat ;
	private int eng ;
	private int hak;
	private int no;
	
	public String hak() {
		String hak = "f";
		if(this.avg()>=90) hak="a";
		else if(this.avg()>=80)
		
	}
	
	
	
	
	public Student1(int kor, int mat, int eng, int hak, int no) {
		super();
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.hak = hak;
		this.no = no;
	}
	@Override
	public String toString() {
		return "Student1 [kor=" + kor + ", mat=" + mat + ", eng=" + eng + ", hak=" + hak + ", no=" + no + "]";
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
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
	public int getHak() {
		return hak;
	}
	public void setHak(int hak) {
		this.hak = hak;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void print() {
		System.out.println();
	}
	
}
