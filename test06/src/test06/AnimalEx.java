package test06;
class Animal { //class
	private String type;
	private String name;
	private int leg;
	private int wing;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	public void print() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	
}
	
public class AnimalEx {
	public static void main(String[] args) {
		Animal p1 =new Animal();
		p1.setType("포유류");
		p1.setName("호랑이");
		p1.setLeg(4);
		p1.setWing(0);
		p1.print();
		
		Animal p2 = new Animal();
		p2.setType("조류");
		p2.setName("독수리");
		p2.setLeg(2);
		p2.setWing(2);
		p2.print();
		
		Animal p3 = new Animal();
		p3.setType("파충류");
		p3.setName("아나콘다");
		p3.setLeg(0);
		p3.setWing(0);
		p3.print();
	}

}
