package creational.abstractfactory;
//Factory �߻� Ŭ���� : �߻� Ŭ������ ����� ����(Factory) ������ �ϴ� Ŭ����
//�����ο� �Ű澲�� �ʰ�, �߻�ü(�������̽�)�� ����� ����
public abstract class Factory {
	//Factory Ŭ������ getFactory() �޼ҵ�� className �Ű������� ���� Ŭ������ ����� �� ���ΰ�
	public static Factory getFactory(String className) {	//���� �޼ҵ�
		Factory factory = null;
		try {
			factory = (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� "+className+"�� �߰ߵ��� �ʾҽ��ϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption, String url);	//�߻� �޼ҵ�
	public abstract Tray createTray(String caption);	//�߻� �޼ҵ�
	public abstract Page createPage(String title, String author);	//�߻� �޼ҵ�
}