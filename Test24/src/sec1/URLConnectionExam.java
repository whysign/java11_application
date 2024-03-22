package sec1;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
//URLConnection Ŭ���� : URL �ּҸ� �̿��� Ŀ�ؼ��� �ٷ�� �߻� Ŭ����
/*
�ֿ� �޼ҵ� ����

�� int getContentLength( )
�ش� ������ ���̸� ����Ʈ ���� ��ȯ�ϴ� �޼����Դϴ�.

�� String getContentType( )
�ش� ������ Ÿ���� ��ȯ�ϴ� �޼����Դϴ�.

�� long getDate( )
�ش� ������ ���� ��¥�� ��ȯ�ϴ� �޼����Դϴ�.

�� long getExpiration( )
�ش� ������ �ı� ��¥�� ��ȯ�ϴ� �޼����Դϴ�.

�� long getLastModified( )
�ش� ������ ������ ���� ��¥�� ��ȯ�ϴ� �޼����Դϴ�.

�� InputStream getInputStream( ) throws IOException
�������κ��� ������ �о� ���̱� ���Ͽ� InputStream ��ü�� �����Ͽ� ��ȯ�ϴ� �޼����Դϴ�.
 */
public class URLConnectionExam {
	public static void main(String[] args) {
		try {
			URL kbs = new URL("https://program.kbs.co.kr/2tv/drama/korea_khitan/pc/index.html");
			try {
				URLConnection kbsCon = kbs.openConnection();
				System.out.println("������ Ÿ�� : "+kbsCon.getContentType());
				System.out.println("������ ������ ���� ���� : "+new Date(kbsCon.getLastModified()));
				System.out.println("������ ũ�� : "+kbsCon.getContentLength()+"Bytes");
				
				int size = kbsCon.getContentLength();
				if(size > 0) {
					System.out.println("*** ������ ������ ������ �����ϴ�. ***");
					InputStream input = kbsCon.getInputStream();
					int i = size;
					int c;
					while(((c = input.read()) != -1) && (--i > 0)) {
						System.out.print((char) c);
					}
					input.close();
				} else {
					System.out.println("������ ������ �����ϴ�.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}