package Exam;

public class Shoping {
	
	private String num; //주문번호
	private String Id; //주문자 아이디
	private String day; //주문 날짜
	private String name;//주문자 이름
	private String onum;//상품번호
	private String adr;//주문자 주소
	public Shoping(String num, String id, String day, String name, String onum, String adr) {
		this.num = num;
		Id = id;
		this.day = day;
		this.name = name;
		this.onum = onum;
		this.adr = adr;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOnum() {
		return onum;
	}
	public void setOnum(String onum) {
		this.onum = onum;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Shoping [주문 번호 =" + num + "\n, Id=" + Id + ", day=" + day + ", name=" + name + ", onum=" + onum + ", adr="
				+ adr + "]";
	}
	
	
	
	
	
}
