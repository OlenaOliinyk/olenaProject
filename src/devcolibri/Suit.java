package devcolibri;

public enum Suit {

        DIAMONDS("diamonds"), CLUBS("clubs"), HEARTS("hearts"), SPADES("spades");
    String name;

    Suit(String suitName) {

        name = suitName;
    }


    public String toString() {

        return this.name;
    }
}


