package devcolibri;

public enum Rank {

    SIX("six"), SEVEN("seven"), EIGHT("eight"), NINE("nine"), TEN("ten"), VALET("valet"),
    DAMA("dama"),KOROL("korol"),TUZ("tuz");

    String name;

    Rank(String rankName) {
        name = rankName;
    }


public String toString() {

        return this.name;
        }
    }

