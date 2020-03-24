/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// String[] ranks = {"jack", "queen", "king"};
		// String[] suits = {"blue", "red"};
		// int[] pointValues = {11, 12, 13};
		// Deck d = new Deck(ranks, suits, pointValues);

		// System.out.println("**** Original Deck Methods ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal a Card ****");
		// System.out.println("  deal: " + d.deal());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deck Methods After 1 Card Dealt ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal Remaining 5 Cards ****");
		// for (int i = 0; i < 5; i++) {
		// 	System.out.println("  deal: " + d.deal());
		// }
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deck Methods After All Cards Dealt ****");
		// System.out.println("  toString:\n" + d.toString());
		// System.out.println("  isEmpty: " + d.isEmpty());
		// System.out.println("  size: " + d.size());
		// System.out.println();
		// System.out.println();

		// System.out.println("**** Deal a Card From Empty Deck ****");
		// System.out.println("  deal: " + d.deal());
		// System.out.println();
		// System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		Deck deck = makeCardDeck();
		System.out.println(deck);
		deck.shuffle();
		System.out.println("\n\n\n" + deck);
		deck.shuffle();
		System.out.println("\n\n\n" + deck);
		deck.shuffle();
		System.out.println("\n\n\n" + deck);
		
	}

	public static Deck makeCardDeck() {
		int fullSize = 52;
		String[] ranks = new String[fullSize];
		String[] suits = new String[fullSize];
		int[] values = new int[fullSize];

		for (int i = 0; i < fullSize; i++) {
			// specifies suits
			if (i/13 == 0) { 
				suits[i] = "Spades"; 
			} else if (i/13 == 1) { 
				suits[i] = "Hearts"; 
			} else if (i/13 == 2) { 
				suits[i] = "Diamonds"; 
			} else if (i/13 == 3) { 
				suits[i] = "Clubs"; 
			} 

			// specifies ranks and values
			values[i] = i%13 + 1;
			if (values[i] == 1) { 
				ranks[i] = "Ace"; 
				values[i] = 14;
			} else if (values[i] <= 10) {
				ranks[i] = String.valueOf(values[i]);
			} else if (values[i] == 11) {
				ranks[i] = "Jack";
			} else if (values[i] == 12) {
				ranks[i] = "Queen";
			} else {
				ranks[i] = "King";
			}
		}

		return new Deck(ranks, suits, values);
	}
}
