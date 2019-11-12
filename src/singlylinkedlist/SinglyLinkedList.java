package singlylinkedlist;

public class SinglyLinkedList {
    private SinglyListNode head;

    /** Initialize your data structure here. */
    public SinglyLinkedList() {
        head = null;
        System.out.println("*** one singly linkedlist was instantiated ***");
    }

    /** Helper function to return the index-th node in the linked list. */
    private SinglyListNode getNode(int index) {
        SinglyListNode cur = head;
        for (int i = 0; i < index && cur != null; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        SinglyListNode cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }

    /** Helper function to return the last node in the linked list. */
    private SinglyListNode getTail() {
        SinglyListNode cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        SinglyListNode cur = new SinglyListNode(val);
        cur.next = head;
        head = cur;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        SinglyListNode tail = getTail();
        SinglyListNode newNode = new SinglyListNode(val);
        tail.next = newNode;
        newNode.next = null;
    }

    /** Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        SinglyListNode prev = getNode(index - 1);
        if (prev == null) {
            return;
        }
        SinglyListNode newNode = new SinglyListNode(val);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        SinglyListNode cur = getNode(index);
        if (cur == null) {
            return;
        }
        SinglyListNode prev = getNode(index - 1);
        SinglyListNode next = cur.next;
        if (prev != null) {
            prev.next = next;
        } else {
            // modify head when deleting the first node.
            head = next;
        }
    }

    /** print the whole list **/
    public void print() {
        SinglyListNode cur = head;
        int counter = 0;
        while (cur != null) {
            System.out.println("Node: " + counter + " Value: " + cur.val);
            cur = cur.next;
            counter += 1;
        }
    }
}