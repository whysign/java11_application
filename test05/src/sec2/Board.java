package sec2;

public class Board {
		private int bno;	
		private String title;
		private String user;
		private String author;
		private String content;
		private int visited;
		public Board() {}
		
		
		public Board(int bno) {
			this.bno = bno;
		}
		public Board(int bno,String title) {
			this.bno =bno;
			this.title=title;
		}
		public Board(int bno,String title,String user) {
			this.bno= bno;
			this.title=title;
			this.user=user;
		}
		public Board(int bno,String title,String user,String author) {
			this.bno= bno;
			this.title=title;
			this.user=user;
			this.author=author;
		}
		public Board(int bno,String title,String user,String author,String content) {
			this.bno= bno;
			this.title=title;
			this.user=user;
			this.author=author;
			this.content=content;
		}
		public Board(int bno,String title,String user,String author,String content,int visited) {
			this.bno= bno;
			this.title=title;
			this.user=user;
			this.author=author;
			this.content=content;
			this.visited=visited;
		}
		
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getVisited() {
			return visited;
		}
		public void setVisited(int visited) {
			this.visited = visited;
		}
		
		
}
