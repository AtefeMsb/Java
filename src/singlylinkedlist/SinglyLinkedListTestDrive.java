package singlylinkedlist;

public class SinglyLinkedListTestDrive {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addAtHead(0);
        myList.addAtIndex(1, 1);
        myList.addAtIndex(2, 2);
        myList.addAtIndex(3, 3);
        myList.addAtIndex(4, 4);

        myList.deleteAtIndex(2);
        myList.addAtHead(100);
        myList.addAtTail(200);
        myList.print();

    }
}
