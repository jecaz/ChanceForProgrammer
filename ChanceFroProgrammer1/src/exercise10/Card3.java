package exercise10;

// Rewrite the class Card from the exercise6 so that it represents the rank and 
// suit of a card with enum types.

public class Card3 {
	
	// Create two variable of enum type Rank and Suit
	private final Rank rank;
	private final Suit suit;
	
	public Card3(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	public Suit getSuit(){
		return suit;
	}
	public Rank getRank(){
		return rank;
	}
	@Override
	public String toString(){
		return rank + " of " + suit;
	}
}
