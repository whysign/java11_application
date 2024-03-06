package sec1;

public class Book {

	public static void main(String[] args) {
		BookEx b1 = new BookEx();
		b1.setBno(101);
		b1.setBname("정보처리기사");
		b1.setPrice(42000);
		b1.setAuthor("박은성");
		b1.setPub("한빛미디어");
		
		BookEx b2 = new BookEx();
		b2.setBno(151);
		b2.setBname("git");
		b2.setPrice(22000);
		b2.setAuthor("bash");
		b2.setPub("한빛");
		
		BookEx b3 = new BookEx();
		b3.setBno(201);
		b3.setBname("정보기사");
		b3.setPrice(15400);
		b3.setAuthor("박성");
		b3.setPub("한미디어");;
		
		BookEx b4 = new BookEx();
		
		b4.print();
		b4.print(b1.getBname(),b1.getPrice(),b1.getAuthor());
		b4.print(b2.getBname(),b2.getPrice(),b2.getAuthor());
		b4.print(b3.getBname(),b3.getPrice(),b3.getAuthor());
		
	}

}
