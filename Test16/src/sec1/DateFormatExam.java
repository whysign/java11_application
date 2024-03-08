package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat :��¥ ǥ�������� ������ �� Ȱ���ϴ� Ŭ���� 
public class DateFormatExam {
	public static void main(String[] args) {
		Date today = new Date();
		//ǥ�� ���� �ڵ� : y-�� ,M-��,d-�� ,h-�� ,m-��,s-�� ,a-����or���� ,E-��ȭ�����(����) , W-���� ���° �� ,w-���� ���° ��
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy��MM��dd�� hh��mm�� ss��");
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat fmt3 = new SimpleDateFormat("���ó�¥ yyyy�� MM�� dd��(E),����ð� : a hh�� mm�� ss��");
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy�� MM��  W��° ��");
		//��¥ �����Ϳ��� Ư�� ǥ�������� �ο��� ���ڿ��� ��ȯ  
		String t1 = fmt1.format(today);
		String t2 = fmt2.format(today);
		String t3 = fmt3.format(today);
		String t4 = fmt4.format(today);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
