package devcolibri;

import java.util.ArrayList;
import java.util.List;

public class Desk2 {

    List<Card2> cards;

    public List<Card2> getNewKoloda() {
        cards = new ArrayList<>();
        Card2 card_1 = new Card2();
        card_1.setSuit(Suit.DIAMONDS);
        card_1.setRank(Rank.SIX);

        cards.add(card_1);

        Card2 card_2 = new Card2();
        card_2.setSuit(Suit.HEARTS);
        card_2.setRank(Rank.SEVEN);

        cards.add(card_2);

        Card2 card_3 = new Card2();
        card_3.setSuit(Suit.CLUBS);
        card_3.setRank(Rank.JACK);

        cards.add(card_3);

        Card2 card_4 = new Card2();
        card_4.setSuit(Suit.SPADES);
        card_4.setRank(Rank.QUEEN);

        cards.add(card_4);
        return cards;

    }


    public  String toString() {
        String result=new String();

       for (Card2 card : cards){
           result+=card.toString()+"\n";
       }


      return result;
    }
}