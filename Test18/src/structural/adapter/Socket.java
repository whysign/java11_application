package structural.adapter;
//110��Ʈ�� ����ϴ� Ŭ����
public class Socket {
	public Volt getVolt() {
		return new Volt(110);
	}
}