package sixLesson.linkedList;

public class LinkList {
    private Link first;


    public void addAtEnd(int data) {
        if (first == null) {
            first = new Link(data);
            return;
        }

        Link tmp = first;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Link(data);
    }


    public void addAtFront(int data) {
        Link newRoot = new Link(data);
        newRoot.next = first;
        first = newRoot;
    }


    public int removeByIndex(int index) {
        int data = 0;
        Link tmp = first;

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

    public Link getByIndex(int index) {
        int data = 0;
        Link tmp = first;

        if (index == tmp.data) {
            data = tmp.data;
            System.out.println(data);
        }

        return tmp;
    }

    public void printList() {
        if (first == null) {
            System.out.println("List is Empty !!");
            return;
        }
        Link tmp = first;
        System.out.println();
        while (tmp != null) {
            System.out.print(">" + tmp.data);
            tmp = tmp.next;
        }

    }

}