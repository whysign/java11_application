package sec2;
public class BookExam {

	public static void main(String[] args) {
		//100 개의 Book 배열 선언
		Book[] book = new Book[100];
		/*	  
		   for(int i=0;i<10;i++) {
		 	book[i] = new Book("dsds"+i,"pes"+i);
		}
		*/
		book[0] =new Book("바자바바","ㅇㅇ");
	    book[1]=new Book("dsadsa","박보");	
	    book[2]=new Book("d2","박2보");
	    book[3]=new Book("3sa","박4보");  		
	    book[4]=new Book("d2ds","박6보");			    
	    for(int i=0;i<5;i++) {
	    	System.out.println(book[i].toString());
	    }	    					
	}
}
