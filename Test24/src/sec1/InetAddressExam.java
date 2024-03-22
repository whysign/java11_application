package sec1;

import java.net.InetAddress;
import java.net.UnknownHostException;
//InetAddress Ŭ���� : IP�ּҸ� �ٷ�� ���� Ŭ����
/*

InetAddress Ŭ������ �ֿ� �޼����

�� boolean equals(InetAddress other)
���� ��ü�� other ��ü�� ���� �ּҸ� ������ true �� ��ȯ�ϰ�, ���� �ּҰ� �ƴϸ� false �� ��ȯ�ϴ� �޼����Դϴ�.

�� byte[] getAddress( )
�ּҸ� ��Ÿ���� 4���� ��Ҹ� ���� ����Ʈ �迭�� ��ȯ�ϴ� �޼����Դϴ�.

�� String getHostAddress( )
�ּ� ������ ��Ÿ���� ���ڿ��� ��ȯ�ϴ� �޼����Դϴ�.

�� String getHostName( )
��ǻ�� �̸��� ��Ÿ���� ���ڿ��� ��ȯ�ϴ� �޼����Դϴ�.

�� InetAddress getLocalHost( ) throws UnknownHostException
���� ��ǻ�͸� ��Ÿ���� InetAddress ��ü�� ��ȯ�ϴ� �޼����Դϴ�.

�� InetAddress getByName(String  hostName) throws UnknownHostException
hostName���� ������ ��ǻ�͸� ��Ÿ���� InetAddress ��ü�� ��ȯ�ϴ� �޼����Դϴ�.

�� InetAddress[] getAllByName(String  hostName) throws UnknownHostException
hostName���� ������ ��� ��ǻ��(�ϳ��� ������ �̸����� ���� ���� ��ǻ�͸� ����ϴ� ���)�� ��Ÿ���� InetAddress ��ü���� �迭�� ��ȯ�ϴ� �޼����Դϴ�.
 
*/
public class InetAddressExam {

	public static void main(String[] args) {
		InetAddress test = null;
		try {
			test = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� ��ǻ���� ��Ʈ��ũ ����");
        System.out.println(test.getHostName() + " " + test.getHostAddress());
        
        InetAddress google_address = null;
        try {
			google_address = InetAddress.getByName("www.google.com");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
        System.out.println("\nGoogle ������ ��Ʈ��ũ ����");
		System.out.println(google_address);
	}
}