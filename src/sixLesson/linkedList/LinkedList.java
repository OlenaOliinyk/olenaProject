package sixLesson.linkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addAtEnd(5);
        list.addAtEnd(8);
        list.addAtEnd(51);
        list.addAtFront(9);
        list.addAtFront(1);
        list.printList();


        list.removeByIndex(0);
        list.printList();
        System.out.println();

        Link f = list.getByIndex(1);

        System.out.println("finded value " + f.data);


    }
}
