package creational.abstractfactory;
//Builder Pattern : ��� �ʵ�� ���� �������� �ϳ� �ϳ� �׾� �÷� ��ü�� �����ϴ� ����
class Student {
	private int no;
	private String name = "ȫ�浿";
	private int point = 0;
	private String phoneNumber = "010-0000-0000";
	public Student(int no, String name, int point, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
class StudentBuilder {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	
	public Student build() {
		return new Student(no, name, point, phoneNumber);
	}

	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
public class BuilderPattern {
	public static void main(String[] args) {
		//StudentBuilder�� �̿��� Student ��ü ���� -> �ش� ����� �ϳ� �� �޼ҵ�ü�̴� ����� ���� �߰��ϴ� ��ü ���� ���
		Student st1 = new StudentBuilder()
				.no(1001)
				.name("�����")
				.point(80)
				.phoneNumber("010-1234-1004")
				.build();
		System.out.println(st1.toString());
		
		Student st2 = new StudentBuilder()
				.no(1002)
				.build();
		System.out.println(st2.toString());
		
		Student st3 = new StudentBuilder()
				.no(1003)
				.name("�̼���")
				.build();
		System.out.println(st3.toString());
		
		Student st5 = new Student(1005, "�̿���", 100, "010-2356-1278"); //�����ڿ� ���� Student ��ü ����
		System.out.println(st5.toString());
	}
}