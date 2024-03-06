package sec1;

public abstract class User {//추상클래스 : 단 하나의 메소드라도 추상화 메소드가 있음.
	private String id;
	private String Pw;
	private int port;
	
	
	
	
	//추상 메소드: 메소드의 기능 구현 내용를 기술하지 않고, 선언함
	
	
	public void connect() {
		System.out.println("회원으로 연결하였습니다.\n ID :"+id+",PW:*****");
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", Pw=" + Pw + ", port=" + port + "]";
	}




	public User(String id, String pw, int port) {
		super();
		this.id = id;
		Pw = pw;
		this.port = port;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getPw() {
		return Pw;
	}




	public void setPw(String pw) {
		Pw = pw;
	}




	public int getPort() {
		return port;
	}




	public void setPort(int port) {
		this.port = port;
	}
	
}
