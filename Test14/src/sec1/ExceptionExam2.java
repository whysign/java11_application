package sec1;
//NullPointerException : ����� ������ �ִ� �����Ұ� ��� �ִ°��
public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		//���� ó���� ����(try)�� ���ܰ� �߻��Ѹ� , ����ó�� ����(catch)�� ����
		try {
			//���� ó���� ����
			System.out.println(name.toString());
			System.out.println("����ó�� ���� �Ʒ�");
		} catch(NullPointerException e) {
			e.printStackTrace();
			name = "������";
			System.out.println(name+"\n����ó�� ���� �Ʒ�");
		} catch(Exception e) {
			System.out.println("��ü�Ұ� ���ܹ߻�");
		} 

	}

}
