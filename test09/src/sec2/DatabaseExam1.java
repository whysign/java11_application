package sec2;

public class DatabaseExam1 {
	public static void main(String[] args) {
		Database db; //객체 선언
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(Oracle.URL,Oracle.PORT+"",Oracle.ID,Oracle.PW);
		db.select("board","where title like \'%\'+알림+\'%\'");
		db.insert("board","\'이시현\'",10);
		
		System.out.println("\nMySQL");
		db = new Mysql();
		db.connect(Mysql.URL,Mysql.PORT+"",Mysql.ID,Mysql.PW);
		db.select("board","where title like \'%\'+알림+\'%\'");
		db.insert("board","\'이수훈\'",11);
		
		System.out.println("\nMariaDB");
		db= new MariaDB();
		db.connect(Mysql.URL,Mysql.PORT+"",Mysql.ID,Mysql.PW);
		db.select("board","where title like \'%\'+알림+\'%\'");
		db.insert("board","\'홍민석\'",11);
					
	}

}
