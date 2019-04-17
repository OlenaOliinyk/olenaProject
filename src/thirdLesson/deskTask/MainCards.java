package thirdLesson.deskTask;


public class MainCards {
    public static void main(String[] args) {

        System.out.println("Desk of cards:");
        Desk desk = new Desk();
        desk.getCards().forEach(c -> System.out.println(c.toString()));
    }
}