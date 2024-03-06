package sec2;
//Top-Down 방식의 생성자 함수 방식
public class News {

	private int bno;	
	private String title;
	private String user;
	private String author;
	private String content;
	private int visited;
	public News() { //top down방식
		this(1);
	}
	public News(int bno) {
		this(bno,"제목");
	}
	public News(int bno, String title) {
		this(bno,title,"admin");
	}
	
	public News(int bno, String title, String user) {
		this(bno,title,user,"151");
	}
	
	public News(int bno, String title, String user, String author ) {
		this(bno,title,user,author,"2024-2-22");
	}
	
	
	public News(int bno, String title, String user, String author, String content) {
		this(bno,title,user,author,content,0);
	}
	
	public News(int bno, String title, String user, String author, String content,int visited) {		
		this.bno = bno;
		this.title = title;
		this.user = user;
		this.author = author;
		this.content = content;	
		this.visited = visited;
		
	}
	@Override
	public String toString() {
		return "News [bno=" + bno + ", title=" + title + ", user=" + user + ", author=" + author + ", content="
				+ content + ", visited=" + visited + "]";
	}	
}
