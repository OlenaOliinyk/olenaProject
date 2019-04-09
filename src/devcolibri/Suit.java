package devcolibri;

public enum Suit {

        DIAMONDS("suitD"), CLUBS("suitC"), HEARTS("suitH"), SPADES("suitS");
    String name;

    Suit(String suitName) {

        name = suitName;
    }


    public String toString() {

        return this.name;
    }
}


