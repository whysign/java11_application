package sec2;

public class Notice {
	private int bno;	
	private String title;
	private String user;
	private String author;
	private String content;
	private int visited;
	public Notice(int bno,String title,String user,String author,String content,int visited) {
		this.bno =bno;
		this.title =title;
		this.user=user;
		this.author=author;
		this.content=content;
		this.visited=visited;
	}
	@Override
	public String toString() {
		return "Notice [bno=" + bno + ", title=" + title + ", user=" + user + ", author=" + author + ", content="
				+ content + ", visited=" + visited + "]";
	}	
		
		
		
	
}
