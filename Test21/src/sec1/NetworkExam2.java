
package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;
//����, �����ͺ��̽�, ��Ʈ��ũ ���� �ܺ� �ڿ����μ� �ݵ�� try/catch ó�� �ؾ� �Ѵ�.
public class NetworkExam2 {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();	//���� ��ǻ��
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			InetAddress[] iArr = InetAddress.getAllByName("www.naver.com"); //���̹� ���� ��ǻ��
			for(InetAddress addr : iArr) {
				System.out.println(addr.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}
}
