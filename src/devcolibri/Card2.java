package devcolibri;

public class Card2 {

    private Suit suit;
    private Rank rank;

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card: " + rank + " " + suit;
    }
}





