package school;

public class Subject {
	private String style ;//�򰡹��
	private String name;//�����
	private int code; //�����ڵ�
	public Subject() {}
	public Subject(String style, String name, int code) {
		super();
		this.style = style;
		this.name = name;
		this.code = code;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Subject [style=" + style + ", name=" + name + ", code=" + code + "]";
	}
	
	
}
