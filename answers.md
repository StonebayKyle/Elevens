##1
- Card[] cards
- Deck deck
- int boardSize
- String[] ranks
- String[] suits
- int[] values

##2
1. Shuffle deck, place nine cards face up
2. Search a deck for a valid set of cards:
    - A pair of cards that add up to 11, Ace counting as 1 and 2-10 counting as their shown value.
    - A jack, queen, and king.
3. If found,
    - remove the set from the other cards and set them aside.
    - Draw, if possible, from the deck to replace the removed cards.
    - Repeat steps 2 and 3.
    - If no more cards are left,
        - You win!
3. If not found,
    - You lose.
    - Place your cards back into the deck and start on step 1.

##3
- Yes, but the unimplemented methods need to be implemented.

##4
1. In the constructor and newGame() method.
2. isLegal(), anotherPlayIsPossible()
3. 0,1,3,6,7
4. in ElevensBoard.java
5. anotherPlayIsPossible() because it needs to look through all the non-null cards/indexes (which is what cardIndexes finds) for the potential sets.
