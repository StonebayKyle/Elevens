package src;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck d = makeTwentyOneGame();
		System.out.println(d);

	}

	// Tests activity 2 exercises
	public static void testDecks() {
		String[] ranks1 = {"One", "Two", "Three"};
		String[] suits1 = {"Spades", "Diamonds", "Clubs"};
		int[] values1 = {1,2,3};
		Deck deck1 = new Deck(ranks1, suits1, values1);

		String[] ranks2 = {"Four", "Five", "Six"};
		String[] suits2 = {"Spades", "Diamonds", "Clubs"};
		int[] values2 = {4,5,6};
		Deck deck2 = new Deck(ranks2, suits2, values2);

		String[] ranks3 = {"Seven", "Eight", "Nine"};
		String[] suits3 = {"Spades", "Diamonds", "Clubs"};
		int[] values3 = {7,8,9};
		Deck deck3 = new Deck(ranks3, suits3, values3);

		System.out.println(deck1.deal());
		System.out.println(deck1.deal());
		System.out.println("Size: " + deck1.size() + "\tIsEmpty? " + deck1.isEmpty());
		System.out.println(deck1.deal());
		System.out.println("Size: " + deck1.size() + "\tIsEmpty? " + deck1.isEmpty() + "\n");
		
		System.out.println(deck2.deal());
		System.out.println(deck2.deal());
		System.out.println("Size: " + deck2.size() + "\tIsEmpty? " + deck2.isEmpty());
		System.out.println(deck2.deal());
		System.out.println("Size: " + deck2.size() + "\tIsEmpty? " + deck2.isEmpty() + "\n");
		
		System.out.println(deck3.deal());
		System.out.println(deck3.deal());
		System.out.println("Size: " + deck3.size() + "\tIsEmpty? " + deck3.isEmpty());
		System.out.println(deck3.deal());
		System.out.println("Size: " + deck3.size() + "\tIsEmpty? " + deck3.isEmpty() + "\n");
	}

	// Answers question 3 of activity 2
	public static Deck makeTwentyOneGame() {
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
				values[i] = 11;
			} else if (values[i] <= 10) {
				ranks[i] = String.valueOf(values[i]);
			} else {
				if (values[i] == 11) {
					ranks[i] = "Jack";
				} else if (values[i] == 12) {
					ranks[i] = "Queen";
				} else {
					ranks[i] = "King";
				}
				values[i] = 10;
			}
		}

		return new Deck(ranks, suits, values);
	}
}
