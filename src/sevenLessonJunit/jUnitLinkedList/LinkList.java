package sevenLessonJunit.jUnitLinkedList;

public class LinkList {
    private Node first;


    public void addAtEnd(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }

        Node tmp = first;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Node(data);
    }

    public void addAtEndString(String dataString) {
        if (first == null) {
            first = new Node(dataString);
            return;
        }

        Node tmp = first;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Node(dataString);
    }


    public void addAtFront(int data) {
        Node newRoot = new Node(data);
        newRoot.next = first;
        first = newRoot;
    }


    public int removeByIndex(int index) {
        int data = 0;
        Node tmp = first;

        if (index < 0)
            return -1;
        if (index == 0) {
            data = first.data;
            first = first.next;
            return data;
        }

        while (index > 0) {
            if (tmp == null) {
                return -1;
            }
            tmp = tmp.next;
            index--;
        }
        data = tmp.data;
        tmp.data = tmp.next.data;
        tmp.next = tmp.next.next;

        return data;
    }

    public Node getByIndex(int index) {
        int data = 0;
        Node tmp = first;

        if (index == tmp.data) {
            data = tmp.data;
            System.out.println(data);
        }

        return tmp;
    }

    public void printList() {
        if (first == null) {
            System.out.println("Node is Empty !!");
            return;
        }
        Node tmp = first;
        System.out.println();
        while (tmp != null) {
            System.out.print("," + tmp.data
          //  +tmp.dataString
            );

            tmp = tmp.next;
        }

    }
}
