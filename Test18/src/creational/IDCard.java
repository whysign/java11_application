package creational;
//Product �߻�Ŭ����
public class IDCard extends Product{

	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner+"�� īƮ�� ����ϴ�.");
		this.owner = owner;	
	}
	
	@Override
	public void use() {
		System.out.println(owner+"�� īƮ�� ����մϴ�.");	
	}
	
	public String getOwner() {
		return owner;
	}
			
}
