package doublylinkedlist;

public class DoublyLinkedListTestDrive {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.addAtHead(100);
        myList.addAtTail(101);
        myList.addAtTail(102);
        myList.addAtTail(103);
        myList.addAtTail(104);
        myList.addAtTail(105);
        myList.deleteAtIndex(2);
        myList.addAtHead(1000);
        myList.print();

    }
}
