package devcolibri;

public enum Suit {

        DIAMONDS("suit D"), CLUBS("suit C"), HEARTS("suit H"), SPADES("suit S");
    String suit;

    Suit(String suitName) {
        suit = suitName;
    }


    public String toString() {

        return this.suit;
    }
}


