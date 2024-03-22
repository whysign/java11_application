
package section;

public class Plane {
	private int pno;	//����� ��ȣ
	private String model;	//����� �𵨸�
	private String name;	//����� �̸�
	private String maker;	//����� ������
	private int speed;		//����� �ӵ�
	private String company;	//�װ���
	public Plane() {} 
	public Plane(int pno, String model, String name, String maker, int speed, String company) {
		this.pno = pno;
		this.model = model;
		this.name = name;
		this.maker = maker;
		this.speed = speed;
		this.company = company;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Plane [pno=" + pno + ", model=" + model + ", name=" + name + ", maker=" + maker + ", speed=" + speed
				+ ", company=" + company + "]";
	}
	
}
