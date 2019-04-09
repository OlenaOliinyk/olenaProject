package devcolibri;

public enum Rank {

    SIX("rank1"), SEVEN("rank2"), EIGHT("rank3"), NINE("card"), TEN("card"), VALET("card"), Dama("card");

    String rank;

    Rank(String rankName) {
        rank = rankName;
    }


public String toString() {

        return this.rank;
        }
    }

