package sec1;

public class BookEx {
	 private int bno;
	 private String bname;
	 private int price;
	 private String author;
	 private String pub;
	 public void print() {
		 System.out.println("교재정보");		 
	 }
	 public void print(String bname,int price) {
		 System.out.println("교재이름:" +bname );
		 System.out.println("교재가격" +price);
	 }
	 public void print(String bname,int price,String author) {
		 System.out.println("교재이름 :" +bname);	 
		 System.out.println("교재가격 :" +price);
		 System.out.println("jj :" +author);
	 }
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	 
	 
}
