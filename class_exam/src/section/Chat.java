
package section;

public class Chat {
	private int no;	//ä�ù��ȣ
	private String title;	//ä�ù��̸�
	private String msg;		//ä�ø޽���
	private String time;	//ä���ۼ��Ͻ�
	private int cnt;		//ä�ù��ο���
	private int read;		//�����ο���
	public Chat() {}
	public Chat(int no, String title, String msg, String time, int cnt, int read) {
		this.no = no;
		this.title = title;
		this.msg = msg;
		this.time = time;
		this.cnt = cnt;
		this.read = read;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getRead() {
		return read;
	}
	public void setRead(int read) {
		this.read = read;
	}
	@Override
	public String toString() {
		return "Chat [no=" + no + ", title=" + title + ", msg=" + msg + ", time=" + time + ", cnt=" + cnt + ", read="
				+ read + "]";
	}
	
}
