package thirdLesson.deskTask;

public class Card {
    private String rank;
    private String suit;

   public Card(String ranks, String suits) {
       this.rank= ranks;
       this.suit = suits;

    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }
}

