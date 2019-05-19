package sixLesson.linkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkList newList = new LinkList();

        newList.add(8);
        newList.add(18);

        newList.add(88);

        newList.insertFirst(10);
        newList.displayList();
        newList.delete(88);

        Link f = newList.find(10);
        System.out.println("find by value " + f.iData);
    }

}
