package exercise10;

//Rewrite the Deck class.

public class Deck3 {
	
	// Create array of 52 cards
	private static Card3[] cards = new Card3[52];
	
	// Initialize every element in the array through constructor
	public Deck3() {
		int i = 0;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards[i++] = new Card3(rank, suit);
       }
   }
}	

public static void main(String[] args) {
		
		// Instantiate Deck3 class
		Deck3 deck = new Deck3();
		
		// Use some Object class methods to avoid compiler warning ("The value of 
		// the local variable deck is not used")
		System.out.println(deck.getClass().isArray());
		
		// Go through array of cards and invoking toString and toLowerCase methods
		for(Card3 card : cards)
			System.out.println(card.toString().toLowerCase());
	}

}
