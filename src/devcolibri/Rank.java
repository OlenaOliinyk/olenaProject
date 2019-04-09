package devcolibri;

public enum Rank {

    SIX("rank1"), SEVEN("rank2"), EIGHT("rank3"), NINE("rank4"), TEN("rank5"), VALET("rank6"),
    DAMA("rank7"),KOROL("rank8"),TUZ("rank9");

    String name;

    Rank(String rankName) {
        name = rankName;
    }


public String toString() {

        return this.name;
        }
    }

