
package section;
//��ٱ���
public class Cart {
	private int cno;	//��ٱ��Ϲ�ȣ
	private String id;	//ȸ�����̵�
	private int pno;	//��ǰ��ȣ
	private int amount;	//��ǰ����
	private int price;	//��ǰ����
	public Cart() {}
	public Cart(int cno, String id, int pno, int amount, int price) {
		this.cno = cno;
		this.id = id;
		this.pno = pno;
		this.amount = amount;
		this.price = price;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [cno=" + cno + ", id=" + id + ", pno=" + pno + ", amount=" + amount + ", price=" + price + "]";
	}
}
