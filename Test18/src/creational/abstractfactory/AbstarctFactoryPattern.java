package creational.abstractfactory;
//Abstarct Factory Pattern : �߻� Ŭ�������� �ڽ� �߻� Ŭ������ �ڽ� �߻� Ŭ������ ���� Ŭ������ ��� �޾�
//ó�� �ǰ� �ϰ�, final ��� ���������� ��ü�� �����Ͽ� Ȱ��ȴٴ� ���鿡�� �߻�ȭ ����(Abstract Factory)�̶�� �Ѵ�.
public class AbstarctFactoryPattern {
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("���޵� ȯ�溯���� �������� �ʽ��ϴ�.");
			System.out.println("Class Name Not Found");
			System.out.println("Main Class ���� ����");
		}
		
		final Factory factory = Factory.getFactory(args[0]);
		
		Link googleLink = factory.createLink("����", "https://www.google.com");
		Link naverLink = factory.createLink("���̹�", "https://www.naver.com");
		Link daumLink = factory.createLink("����", "https://www.daum.net");
		
		final Tray searchTray = factory.createTray("�˻�����");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		final Page page = factory.createPage("�˻����� ����Ʈ", "�����");
		page.add(searchTray);
		
		page.output();
		/*
		ListPage�� makeHTML() �޼ҵ� ������ ���
		 */
	}
}