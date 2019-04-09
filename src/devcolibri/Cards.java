package devcolibri;

public class Cards {


    public enum Rank {
        SIX, SEVEN, EIGHT, NINE, TEN, VALET, Dama;
        String rankName;


        public String toString() {
            return this.rankName;
        }
    }


   public enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES;
        String suitName;
        public String toString() {
            return this.suitName;
        }

    }

}




