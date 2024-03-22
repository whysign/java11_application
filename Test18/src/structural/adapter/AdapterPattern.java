package structural.adapter;
//Adapter Pattern : Ư�� Ŭ������ �������̽��� �����ڰ� ���ϴ� �������̽��� ���·� ��ȯ��Ű�� ����
//����(Structural) ���� : ����ϴ� Ŭ������ Ȯ���Ͽ� �Ǵ� �����Ͽ� �� ū ������ ����� ���� 
//�׷��Ƿ�, Adapter Pattern�� ���� �ٸ� �������̽��� ���� Ŭ������ �Բ� ����� �� �ֵ��� �ϴ� ����
public class AdapterPattern {
	public static void main(String[] args) {
		System.out.println("ObjectAdapter");
		testObjectAdater();
		System.out.println("ClassAdapter");
		testClassAdater();
	}
	public static void testObjectAdater() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
		System.out.println("V6 Volts using Object Adapter => "+v6.getAmount());
		System.out.println("V9 Volts using Object Adapter => "+v9.getAmount());
		System.out.println("V12 Volts using Object Adapter => "+v12.getAmount());
		System.out.println("V110 Volts using Object Adapter => "+v110.getAmount());
	}
	public static void testClassAdater() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter, 12);
		Volt v110 = getVolt(sockAdapter, 110);
		System.out.println("V6 Volts using Class Adapter => "+v6.getAmount());
		System.out.println("V9 Volts using Class Adapter => "+v9.getAmount());
		System.out.println("V12 Volts using Class Adapter => "+v12.getAmount());
		System.out.println("V110 Volts using Class Adapter => "+v110.getAmount());
	}
	public static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 6: return sockAdapter.get6Volt();
		case 9: return sockAdapter.get9Volt();
		case 12: return sockAdapter.get12Volt();
		default: return sockAdapter.get110Volt();
		}
	}
}