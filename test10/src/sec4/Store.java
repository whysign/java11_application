package sec4;
//다중 상속 안됨
//public class Pay extends Inventory {}
public class Store extends Pay {

	@Override
	public void Pay() {
		System.out.println("상점");
		super.Pay();  //조상클래스혹은 부모클래스 를 슈퍼클래스라고한다
	}

	@Override
	public void inventory() {
		System.out.println("상점");
		super.inventory();
	}
		
}
