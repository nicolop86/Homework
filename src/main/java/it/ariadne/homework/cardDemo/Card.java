package it.ariadne.homework.cardDemo;

public class Card {

	private Rank rank;
	private Suit suit;

	public Card (Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String rankToString () {
		switch(this.rank) {
		case ACE:
			return ("Ace");
		case EIGHT:
			return ("Eight");
		case FIVE:
			return ("Five");
		case FOUR:
			return ("Four");
		case JACK:
			return ("Jack");
		case KING:
			return ("King");
		case NINE:
			return ("Nine");
		case QUEEN:
			return ("Queen");
		case SEVEN:
			return ("Seven");
		case SIX:
			return ("Six");
		case TEN:
			return ("Ten");
		case THREE:
			return ("Three");
		case TWO:
			return ("Two");
		default:
			return "Invalid entry for rank!";
		}
	}

	public String suitToString () {
		switch(this.suit) {
		case HEARTS:
			return "Hearts";
		case SPADES:
			return "Spades";
		case DIAMONDS:
			return "Diamonds";
		case FLOWERS:
			return "Flowers";
		default:
			return "Invalid entry for suit!";
		}
	}

	public String toString() {
		return ("Card: " + this.rankToString() + " of " + this.suitToString());
	}

	public boolean equals (Object c)  {
		boolean r = false;
		if (c instanceof Card) {
			if (((Card) c).rankToString().compareTo(this.rankToString()) + 
					((Card) c).suitToString().compareTo(this.suitToString()) == 0){
				r = true;
			}
		}
		return r;
	}

	public int hashCode () {
		int nrank;
		int nsuit;
		switch(this.rank) {
		case ACE:
			nrank = 1;
			break;
		case EIGHT:
			nrank = 8;
			break;
		case FIVE:
			nrank =5;
			break;
		case FOUR:
			nrank = 4;
			break;
		case JACK:
			nrank = 11;
			break;
		case KING:
			nrank = 13;
			break;
		case NINE:
			nrank = 9;
			break;
		case QUEEN:
			nrank = 12;
			break;
		case SEVEN:
			nrank = 7;
			break;
		case SIX:
			nrank = 6;
			break;
		case TEN:
			nrank = 10;
		case THREE:
			nrank = 3;
			break;
		case TWO:
			nrank = 2;
			break;
		default:
			nrank = 0;
		}

		switch(this.suit) {
		case HEARTS:
			nsuit = 1;
			break;
		case SPADES:
			nsuit = 3;
			break;
		case DIAMONDS:
			nsuit = 2;
			break;
		case FLOWERS:
			nsuit = 4;
			break;
		default:
			nsuit = 0;
		}
			int hash = nrank*nsuit;
			return hash;
	}
}