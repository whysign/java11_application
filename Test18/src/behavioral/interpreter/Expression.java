package behavioral.interpreter;
//Expression : �������̽�(�߻�ü)�μ� ���� �޼ҵ�� ǥ������ ����
//And/Or ������ ���� => ���� ���
public interface Expression {
	public boolean interpreter(String context); 
}