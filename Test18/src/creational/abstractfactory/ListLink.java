package creational.abstractfactory;

public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() { //<a href="http://www.naver.com">���̹�</a>
		return "<a href=\""+url+"\">"+caption+"</a>";
	}
	
}