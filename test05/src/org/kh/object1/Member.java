package org.kh.object1;
// 회원 클래스를 작성하되 ,아이디 비밀번호.이메일,생년 전화번호. 등을 요소로 하고 
// 회원정보를 출력하는 메서드를 작성해라
// public->protected->default->private
// 모든패키지나 클래스 다된다 << * 이라고한다  protected 는 동일/상속/연관  ,default는 동일,private는 현재클래스를의미함
public class Member {
	private	String member ;
	private	String tel ;
	private	int birth;
	private	String mail;
	private	String id;
	private	String pw;
			
		public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String toString() {
		return "Member [member=" + member + ", \ntel=" + tel + ", \nbirth=" + birth + ", \nmail=" + mail + ", \nid=" + id
				+ ", \npw=" + pw + "]";
	}
		// @Override <<=상속받아서 내용을 바꾼뒤 정의한다								
}
