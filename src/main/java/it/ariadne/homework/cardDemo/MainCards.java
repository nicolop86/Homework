package it.ariadne.homework.cardDemo;

public class MainCards {

	public static void main(String[] args) {
		
		Card[] cards = new Card[Rank.values().length*Suit.values().length];
		Deck myDeck;
		int rlength = Rank.values().length;
		int slength = Suit.values().length;
		
		for (int i=0; i<slength; i++) {
			for (int j=0; j<rlength; j++){
				cards[i*rlength+j] =
						new Card(Rank.values()[j],Suit.values()[i]);
			}
		}
		
		myDeck = new Deck(cards);
		myDeck.showAllCards();
	}
}
