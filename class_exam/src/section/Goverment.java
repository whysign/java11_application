
package section;

public class Goverment {
	private int gno;	//���α���ڵ�
	private String name;	//���α����
	private String addr;	//���α�� �ּ�
	private String tel;		//���α�� ����ó
	private int budget;		//�����
	private int empCnt;		//�����ڼ�
	public Goverment() {}
	public Goverment(int gno, String name, String addr, String tel, int budget, int empCnt) {
		this.gno = gno;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.budget = budget;
		this.empCnt = empCnt;
	}
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public int getEmpCnt() {
		return empCnt;
	}
	public void setEmpCnt(int empCnt) {
		this.empCnt = empCnt;
	}
	@Override
	public String toString() {
		return "Goverment [gno=" + gno + ", name=" + name + ", addr=" + addr + ", tel=" + tel + ", budget=" + budget
				+ ", empCnt=" + empCnt + "]";
	}
	
}
