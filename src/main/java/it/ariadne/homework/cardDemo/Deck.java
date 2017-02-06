package it.ariadne.homework.cardDemo;

public class Deck {
	
	private Card cards [];
	
	public Deck (Card cards []) {
		this.cards = cards;
	}
	
	public void showAllCards() {
		for(Card c : this.cards) {
			System.out.println("Card from deck: " + c.rankToString() + " of " + c.suitToString());
		}
	}
	
	public Card getCard(Rank r, Suit s) {
		for(Card c : cards) {
			if (c.rankToString().compareToIgnoreCase(r.toString())== 0 &&
					c.suitToString().compareToIgnoreCase(s.toString()) == 0) {
				return c;
			}
		}
		return null;
	}
}