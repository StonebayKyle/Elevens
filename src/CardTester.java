package src;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Three", "Spades", 3);
		Card card2 = new Card("Four", "Diamonds", 4);
		Card card3 = new Card("Three", "Spades", 3);

		System.out.println(card1);
		System.out.println("Card 1 matches card 2? " + card1.matches(card2));
		System.out.println("Card 1 matches card 3? " + card1.matches(card3));
		System.out.println("Card 2 matches card 3? " + card2.matches(card3));

	}
}
