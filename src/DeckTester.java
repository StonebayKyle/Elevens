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
}
