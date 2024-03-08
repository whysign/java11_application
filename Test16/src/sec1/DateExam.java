package sec1;
import java.time.LocalDate;
// ���� 0���� �����Ѵ�
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date1 =new Date();
		
		@SuppressWarnings("deprecation")
		Date date2 =new Date(1981,11,25,7,24,37);
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon,02 Apr 2001 03:48:27 +0900"); //+0900 : RFC 822 �԰�    Ÿ����
		//�����̸� (Global/Local) :  KST, RFC 822 :+ 0900
		//�����ڵ�  : KR, ����ڵ� : KO => KO_KR
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("****LocalDate*****");
		
		LocalDate now1 = LocalDate.now();
		System.out.println(now1); //��¥ ������
		//��¥ ������ => ���ڿ� ������
		String now2 =now1.toString();
		//���ڿ� ������ => ��¥������ 
		LocalDate now3 =LocalDate.parse(now2);
		System.out.println("��¥������ : "+now1);
		System.out.println("��¥ �����͸� ���ڿ� �����ͷ� ��ȯ : " +now2);
		System.out.println("���ڿ� �����͸� ��¥�����ͷ� ��ȯ : " +now3);
		
	}
}
