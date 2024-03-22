package creational.abstractfactory;

public abstract class Link extends Item {
	protected String url;
	//<a href="http://www.naver.com">���̹�</a>
	//href �Ӽ��� ��("http://www.naver.com")�� url
	//a �±� ���̿� �ִ� "���̹�"�� caption
	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
	public abstract String makeHTML();
}