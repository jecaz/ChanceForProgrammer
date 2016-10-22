package exercise6;


public class Deck {
	
	public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;
    
    // Use constructor to instantiate two dimensional array of Cards and 
    // assigned values to each element of the array of type Card
    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }
    // return card on specific indices
    public Card getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}

