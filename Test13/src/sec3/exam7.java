package sec3;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	public Book() {}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
public class exam7 {

	public static void main(String[] args) {
		List<Book> bookList =new ArrayList<Book>();
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",35000));
		bookList.add(new Book("안드로이드",15000));
		//1. 모든 책의 가격의 합계
		System.out.println(bookList.stream()
		.mapToInt(a-> a.getPrice()).sum());
		//2. 책의 가격이 2만원이상의 책이름을 정력해라
		System.out.println("2만원 이상의 책이름 을 출력");
		bookList.stream().filter(a->a.getPrice()>=20000).map(b -> b.getName())
		.sorted().forEach(s->System.out.println(s));
		
	}

}
