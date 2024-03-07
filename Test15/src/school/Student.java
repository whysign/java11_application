package school;

public class Student {
	private String name;//이름
	private Subject subject;//필수과목
	private int no;//학번
	public Student() {}
	public Student(String name, Subject subject, int no) {
		super();
		this.name = name;
		this.subject = subject;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", no=" + no + "]";
	}
	
}
