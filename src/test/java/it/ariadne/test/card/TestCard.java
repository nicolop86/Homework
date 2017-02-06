package it.ariadne.test.card;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.ariadne.homework.cardDemo.*;

public class TestCard {

	private Card queenOfHearts;
	private Deck testDeck;

	@Before
	public void setup() {
		Rank r = Rank.QUEEN;
		Suit s = Suit.HEARTS;
		queenOfHearts = new Card(r, s);
		Card[] cards = new Card[52];
		for (int i=0; i<Suit.values().length; i++) {
			for (int j=0; j<Rank.values().length; j++){
				cards[i*Rank.values().length+j] =
						new Card(Rank.values()[j],Suit.values()[i]);
			}
		}
		testDeck = new Deck(cards);
	}

	@Test
	public void testSuitToString() {
		Assert.assertEquals("Queen of Hearts suit is Hearts!","Hearts",
				queenOfHearts.suitToString());
	}

	@Test
	public void testRankToString() {
		Assert.assertEquals("Queen of Hearts rank is Queen!", "Queen",
				queenOfHearts.rankToString());
	}
	
	@Test
	public void testToStringMethod() {
		Assert.assertEquals("Testing toString method on cards...", "Card: Queen of Hearts",
				queenOfHearts.toString());
	}
	
	@Test
	public void equalsCard() {
		Assert.assertEquals("Checking equals method...", true, queenOfHearts.equals
				(new Card(Rank.QUEEN, Suit.HEARTS)));
		Assert.assertEquals("Checking equals method...", false, queenOfHearts.equals
						(new Card(Rank.ACE, Suit.SPADES)));
		Assert.assertEquals("Checking equals method...", false, queenOfHearts.equals
				("Hello!"));
	}

	@Test
	public void getCardMethod(){
		Assert.assertEquals("Testing getCard method...", new Card(Rank.TWO, Suit.DIAMONDS),
				testDeck.getCard(Rank.TWO, Suit.DIAMONDS));
		Card[] cardsToFail = new Card[39];
		for (int i=0; i<Suit.values().length-1; i++) {
			for (int j=0; j<Rank.values().length; j++){
				cardsToFail[i*Rank.values().length+j] =
						new Card(Rank.values()[j],Suit.values()[i]);
			}
		}
		Deck deckToFail = new Deck(cardsToFail);
		Assert.assertEquals("Testing getCard method...", null,
				deckToFail.getCard(Rank.TWO, Suit.FLOWERS));
	}
	
	@Test
	public void testhashCodeMethod() {
		Assert.assertEquals("Testing hashCode method...", 27,
				testDeck.getCard(Rank.NINE, Suit.SPADES).hashCode());
	}

}