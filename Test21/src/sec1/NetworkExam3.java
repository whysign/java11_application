package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkExam3 {
	public static void main(String[] args) {
		try {
			//���� ��ǻ���� ip�ּ� ��ǻ�� �̸� ���
			InetAddress local = InetAddress.getLocalHost();	//���� ��ǻ��
			System.out.println("���� ��ǻ�� ip �ּ� : "+local.getHostAddress());
			System.out.println("��Ʈ��ũ���� ��ǻ�� �̸� : "+local.getHostName());
			//www.google.com�� ���� IP �ּҸ� ���
			InetAddress[] iArr = InetAddress.getAllByName("www.goole.com");
			System.out.println("www.goole.com");
			for(InetAddress addr : iArr) {
				System.out.println(addr.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}