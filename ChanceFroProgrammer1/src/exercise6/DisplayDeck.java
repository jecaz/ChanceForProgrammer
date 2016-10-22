package exercise6;


public class DisplayDeck {

	public static void main(String[] args) {
		
		// Create object of Deck class
		Deck deck = new Deck();
		
		// Through for loop displaying all combination of cards
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                    Card.rankToString(card.getRank()),
                    Card.suitToString(card.getSuit()));
            }
        }
    }
}
