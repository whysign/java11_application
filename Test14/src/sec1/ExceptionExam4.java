package sec1;

public class ExceptionExam4 {

	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "park0722";
		try {					
		int val1 =Integer.parseInt(data1);
		int val2 =Integer.parseInt(data2);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+20);
		} catch(NumberFormatException e) {
			System.out.println("������������ ó�� �Ұ��� �� ������");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("��ü �� �˼����� ����");
			e.getMessage();
		}finally {
			System.out.println("����");
		}
		
		
	}
}
