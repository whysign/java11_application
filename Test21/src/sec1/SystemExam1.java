package sec1;

public class SystemExam1 {

	public static void main(String[] args) {
		//����, �ڹ� �������� ������ ����Ѵٸ�,
		String vendor = System.getProperty("java.vendor");
		System.out.println("�ڹ� �������� ���� : "+vendor);
		//���� �ڹ� ��ġ ����(java.version) ���
		System.out.println("���� �ڹ� ��ġ ���� : "+System.getProperty("java.version"));
		//�ڹ� Ŭ���� ���(java.class.path) ���
		System.out.println("�ڹ� Ŭ���� ��� : "+System.getProperty("java.class.path"));
		//�ü�� �̸�(os.name) ���
		System.out.println("�ü�� �̸� : "+System.getProperty("os.name"));
		//����� ����(user.name) ���
		System.out.println("����� ���� : "+System.getProperty("user.name"));
		//���� ���丮(user.dir) ���
		System.out.println("���� ���丮 : "+System.getProperty("user.dir"));
	}

}