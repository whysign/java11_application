
package section;

public class Custom {
	private int cno;	//���ڵ�
	private String name;		//����
	private int age;	//����
	private String addr;	//�ּ�
	private String tel;		//����ó
	public Custom() {}
	public Custom(int cno, String name, int age, String addr, String tel) {
		this.cno = cno;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Custom [cno=" + cno + ", name=" + name + ", age=" + age + ", addr=" + addr + ", tel=" + tel + "]";
	}
	
}
