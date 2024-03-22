package creational;
//product Ŭ������ ��ü�� �����ϴ� Factory �߻� Ŭ������ creat()�޼ҵ�
//Factory Method ���� : Product�� ����� creat() �޼ҵ尡 �����Ƿ� �̷��� ���� Fatory Method ����Ѵ�
public abstract class Factory {//�߻�ü
	public final Product creat(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
