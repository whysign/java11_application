package creational.abstractfactory;

public abstract class Item {	//Link, Page, Tray��  Super Ŭ����
	protected String caption;	//����
	public Item(String caption) {	//������
		this.caption = caption;
	}
	public abstract String makeHTML();	//�߻� �޼ҵ� 
}