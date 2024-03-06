package sec3;

public class LunchEx {


	public static void main(String[] args) {
		Lunch lunch;
		lunch = new korea();
		lunch.eating("비빔밥");
		
		lunch = new Japan();
		lunch.eating("스시");
		
		lunch = new china();
		lunch.eating("유린기");
		
		
	}
			
}
