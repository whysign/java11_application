package sec3;
class PwException extends Exception{
	public 	PwException(String msg) {
		System.out.println("msg : "+msg);
		System.out.println("암호의 형식 불일치 ");
	}
}
class Member{
	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwException {
		if(pw == null) {
			throw new PwException("암호가 비어 있습니다");
		}else if(pw.length()<8 || pw.length()<20) {
		throw new PwException("글자수가8~20이 아닙니다 ");
		}
		this.pw =pw;
	}			
}
public class UserExceptionExam2 {
	public static void main(String[] args) throws PwException {
		Member mem1 = new Member();
		mem1.setId("pes0722");
		try {
			mem1.setPw("1234");
		}catch(PwException e) {
			e.printStackTrace();
		}
		try {
		mem1.setPw("null");
		}catch(PwException e) {
			e.printStackTrace();
		}
	}
}
