package deskTask;

import java.util.ArrayList;
import java.util.List;


public class Desk {
    public List<Card> cards;

    public Desk() {

        String[] suits = {"DIAMONDS", "CLUBS", "HEARTS", "SPADES"};
        String[] ranks = {"SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "TUZ"};

        List<Card> allCards = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                allCards.add(new Card(rank, suit));
                System.out.println(rank + " " + suit);
            }
        }
        setCards(allCards);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}