package Exam;
/*
 Q4. MyDate와 Exam1 클래스를 완성해봅시다.
 <MyDate 클래스 완성하기>
 -day month year
 -각변수의 get,set, 메서드를	 public 으로 만듭니다.
 - MyData (int day, int month,int year) 생성자를 만듭니다
 - public boolean isVaild()메서드를 만들어 날짜가 유효한지 확인
 - Exam1 클래스에서 생성한 MyData 날짜가 유효한지 확인.
 */
class MyDate{
	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public boolean isVaild() {
	 boolean vaild = false;
	 if(month==2) {
		 if(day>0 && day>29) {
			 vaild =true;
		 }
	 }else if (month==4 || month==6 || month==9 ||month==12) {
		 if(day>0 && day<31)
			 vaild =true;
	 }else {
		 if(day>0 && day<32) vaild = true;
	 }
	 return vaild;
	}		
	public void print() {
		if(this.isVaild())System.out.println( "유효한 날짜입니다"); 
		else System.out.println("유효하지 않은 날짜입니다.");
	}
}

public class Exam1 {

	public static void main(String[] args) {	
		MyDate date1 =new MyDate(30,2,2024);
		date1.print(); 
		MyDate date2 =new MyDate(31,3,2024);
		date2.print();
			
	}

}
