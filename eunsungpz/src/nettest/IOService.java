package nettest;

import java.io.FileOutputStream;
import java.io.IOException;

class IOService {
		public static void main(String[] args) {
			output1();
		}
		public static void output1() {
			FileOutputStream fos = null;	//1. 1byte�� �ٷ�� OutputStream�� ����ϱ⶧���� 2byte�� �ѱ��� ���������� ��µ��� �ʴ´�.
			try {
				fos = new FileOutputStream("test.txt");
				String str = "�ȳ��ϼ���!";
				for(int i=0 ; i<str.length() ; i++) {
					fos.write( str.charAt(i) );
				}
			} catch(IOException e) {
				e.printStackTrace();
			} //2. finally ������ ���� �߻� ������ ������� �ڿ���ȯ�� �ؾ��ϴ� close() ������ �ۼ����� �ʾҴ�.
		}
	}