/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("4", "Spades", 4);
		Card card2 = new Card("7", "Hearts", 7);
		Card card3 = new Card("4", "Spades", 4);
		System.out.println("Does card 1 match card 2?" + card1.matches(card2));
		System.out.println("Does card 1 match card 3?" + card1.matches(card3));
		System.out.println("Card 1's Suit: " + card1.suit());
		System.out.println("Card 1: " + card1.toString());
	}
}
