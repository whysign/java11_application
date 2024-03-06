package sec2;

public class Connection implements Database {

	@Override
	public void connect(String url, String id, String pw) {
		System.out.println("ㅇㅇ");
		
	}

	@Override
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(String tbname, String condition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(String tbname, String field1, int field2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String tbname, String field1, int value1, String condition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String tbname, String condition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connect(String url, String port, String id, String pw) {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
