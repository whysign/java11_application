package creational;
//product 클래스의 객체를 생성하는 Factory 추상 클래스의 creat()메소드
//Factory Method 패턴 : Product를 만드는 creat() 메소드가 있으므로 이러한 것을 Fatory Method 라고한다
public abstract class Factory {//추상체
	public final Product creat(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product p);
}
