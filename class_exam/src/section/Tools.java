
package section;

public class Tools {
	private int tno;	//���� ��ȣ
	private String name;	//���� �̸�
	private String url;		//���� ��ġ ���
	private int volume;		//���� �뷮
	private int price;		//���� ����
	public Tools() {}
	public Tools(int tno, String name, String url, int volume, int price) {
		this.tno = tno;
		this.name = name;
		this.url = url;
		this.volume = volume;
		this.price = price;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tools [tno=" + tno + ", name=" + name + ", url=" + url + ", volume=" + volume + ", price=" + price
				+ "]";
	}
}
