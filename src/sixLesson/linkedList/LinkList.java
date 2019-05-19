package sixLesson.linkedList;

public class LinkList {
    Link first;

    public LinkList() {
        first = null;
    }

    public void add(int iD) {

        Link newNode = new Link(iD);
        first = newNode.next;

        newNode.displayLink();

    }

    public void insertFirst(int iD) {
        Link newNode = new Link(iD);
        newNode.next = first;
        first = newNode;
    }


    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link delete(int value) {
        Link current = first;
        Link previous = first;

        while (current.next != null) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }

            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
        }
        return current;
    }

    public void displayList() {

        Link current = first;


        while (current != null) {

            current.displayLink();
            current = current.next;
        }
        System.out.println("__");
    }
}
