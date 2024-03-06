package Exam;

public class CardCompany {
	private static CardCompany instance =new CardCompany();
	private CardCompany() {}
	public CardCompany getInstance() {
		if(instance == null) instance = new CardCompany();
		return instance;				
	}
	public Card createCard() {
		Card card = new Card();
		return card;
	}
		
}
