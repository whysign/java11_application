package Exam;

public class Card {
	private int cardNumber;
	private static int seriaLNumer =1000;//고유번호
	Card(){
		seriaLNumer++;
		cardNumber = seriaLNumer;				
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public static void setSeriaLNumer(int seriaLNumer) {
		Card.seriaLNumer = seriaLNumer;
	}
	
				
}
