package sixLesson;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();


        states.add("Germany");
        states.add("France");
        states.add("Ukraine");

        states.addLast("UK");

        states.addFirst("Albania");

        states.add(3, "Bahamas");

        System.out.printf("In the List %d elements \n", states.size());


        for (String state : states) {
            System.out.println(state);
        }


        states.remove(3);
        states.removeFirst();

        System.out.println("++++++");
        System.out.println(states.get(1) + " is got by index ");
        System.out.println("++++++");
        System.out.println("List after removing");
        for (String state : states) {
            System.out.println(state);
        }

    }
}