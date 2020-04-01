##1
- Size isn't an abstract method because all boards' sizes are whatever cards.length is.
- cards.length may change, but the implementation of size() does not.

##2
- There are no abstract methods regarding that because those methods are private helper methods for the abstract method isLegal()
- The helper methods are specific to each game type as what needs helping can change completely enough that a different signature should be used, which shouldn't be encompassed by a parent abstract method.

##3
- It would technically work, but then all behaviours will need to be copied in each class, even when they are duplicate.
- Therefore, this wouldn't work as well as a design as duplicate code is generally bad.