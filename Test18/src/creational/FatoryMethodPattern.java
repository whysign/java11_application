package creational;
//FatoryMethod ���� : ��ü�� ����� �κ��� ���� Ŭ����(Sub Class)�� �����ϴ� ����
//Fatory Ŭ������ Ȱ���Ͽ� Sub Class�� IDCardFactory�� �����.
//�ź���(IDCard)�� ����� ����(IDcard)�� Ȱ��
//
public class FatoryMethodPattern {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.creat("��");
		Product card2 = factory.creat("��");
		card1.use();
		card2.use();
		
	}
}
