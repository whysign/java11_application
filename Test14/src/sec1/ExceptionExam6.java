package sec1;
//ClassNotFoundException : �ش� Ŭ������ ã�� �� ���� ���, ��, ����̹��� ��Ű�� �̸��� Ʋ�Ȱų� ���̺귯���� �߰����� ���� ���
public class ExceptionExam6 {

	public static void main(String[] args) {
		
		try {
			Class driver = Class.forName("oracle.jdbc.driver");
		} catch (ClassNotFoundException e) {
			System.out.println("�ش� ����Ŭ ����̹��� ã�� ���߽��ϴ�.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("���� �Ҹ�");
		}finally {
			System.out.println("����");
		}

	}

}
