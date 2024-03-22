
package section;

public class Product {
	private int pno;	//��ǰ��ȣ
	private String name;	//��ǰ��
	private String cate;	//ī�װ���
	private int price;		//��ǰ�ܰ�
	private String url;		//��ǰ�̹��� ���
	private int amount;		//����
	public Product() { }
	public Product(int pno, String name, String cate, int price, String url, int amount) {
		this.pno = pno;
		this.name = name;
		this.cate = cate;
		this.price = price;
		this.url = url;
		this.amount = amount;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", cate=" + cate + ", price=" + price + ", url=" + url
				+ ", amount=" + amount + "]";
	}
}
