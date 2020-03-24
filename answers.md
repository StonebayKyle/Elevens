##1
- deal()
- Likely didn't return null when size is 0, so size decrements and cards.get(-1) is ran, and a -1 index doesn't exist.
##2
- Deck()
- Likely set size to cards.size()-1 or just set size = 0, when it should have been set to cards.size().
##3
- deal()
- Shuffle isn't being called, when it probably should be.
##4
- deal()
- Size is 0 when it shouldn't be when deal() is called. Likely set size to cards.size()-1 or just set size = 0, when it should have been set to cards.size() in Deck() constructor