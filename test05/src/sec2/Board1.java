package sec2;

public class Board1 {
		private int bno;//글번호
		private String title;//제목
		private String user;//이름
		private String content;//글내용
		private String res; //작성일
		private int visited;
		private String field;
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
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getRes() {
			return res;
		}
		public void setRes(String res) {
			this.res = res;
		}
		public int getVisited() {
			return visited;
		}
		public void setVisited(int visited) {
			this.visited = visited;
		}
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		
		
		
		
		public Board1(int bno, String title, String user, String content, String res, int visited, String field) {
			super();
			this.bno = bno;
			this.title = title;
			this.user = user;
			this.content = content;
			this.res = res;
			this.visited = visited;
			this.field = field;
		}
		@Override
		public String toString() {
			return "Board1 [bno=" + bno + ", title=" + title + ", user=" + user + ", content=" + content + ", res="
					+ res + ", visited=" + visited + ", field=" + field + "]";
		}
		
		
}
