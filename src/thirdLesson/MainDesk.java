package thirdLesson;


public class MainDesk {


    public static void main(String[] args) {
        String[] suit = {"DIAMONDS", "HEARTS", "CLUBS","SPADES"};
        String[] runk = {"six", "seven","eight","nine","ten","valet","dama","korol","tuz"};
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < runk.length; j++) {
                System.out.println(runk[j] +" "+ suit[i]);
            }

        }
    }
}
