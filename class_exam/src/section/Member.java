
package section;

public class Member {
	private int mcode;	//�����ڵ�
	private String id;	//ȸ�����̵�
	private String pw;	//��й�ȣ
	private String name;		//�̸�
	private int year;	//����⵵
	private String tel;		//����ó
	public Member() {}
	public Member(int mcode, String id, String pw, String name, int year, String tel) {
		this.mcode = mcode;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.year = year;
		this.tel = tel;
	}
	public int getMcode() {
		return mcode;
	}
	public void setMcode(int mcode) {
		this.mcode = mcode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [mcode=" + mcode + ", id=" + id + ", pw=" + pw + ", name=" + name + ", year=" + year + ", tel="
				+ tel + "]";
	}
	
}
