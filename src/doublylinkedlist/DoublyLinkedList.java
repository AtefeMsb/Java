package doublylinkedlist;

import singlylinkedlist.SinglyListNode;

public class DoublyLinkedList {
    private DoublyListNode head;

    /** Initialize your data structure here. */
    public DoublyLinkedList() {
        head = null;
        System.out.println("A doubly linkedlist was instantiated");
    }

    /** Helper function to return the index-th node in the linked list. */
    private DoublyListNode getNode(int index) {
        DoublyListNode cur = head;
        for (int i = 0; i < index && cur != null; ++i) {
            cur = cur.next;
        }
        return cur;
    }
    /** Helper function to return the last node in the linked list. */
    private DoublyListNode getTail() {
        DoublyListNode cur = head;
        while (cur != null && cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        DoublyListNode cur = getNode(index);
        return cur == null ? -1 : cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        DoublyListNode cur = new DoublyListNode(val);
        cur.next = head;
        if (head != null) {
            head.prev = cur;
        }
        head = cur;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        DoublyListNode tail = getTail();
        DoublyListNode cur = new DoublyListNode(val);
        cur.prev = tail;
        tail.next = cur;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        DoublyListNode prev = getNode(index - 1);
        if (prev == null) {
            return;
        }


        DoublyListNode next = prev.next;
        DoublyListNode cur = new DoublyListNode(val);

        prev.next = cur;
        cur.prev = prev;
        cur.next = next;
        if (next != null) {
            next.prev = cur;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        DoublyListNode cur = getNode(index);
        if (cur == null) { return;}

        DoublyListNode prev = cur.prev;
        DoublyListNode next = cur.next;

        if (prev != null) {
            prev.next = next;
        } else {
            // modify head when deleting the first node.
            head = next;
        }
        if (next != null) {
            next.prev = prev;
        }
    }

    /** print the whole list **/
    public void print() {
        DoublyListNode cur = head;
        int counter = 0;
        while (cur != null) {
            System.out.println("Node: " + counter + " Value: " + cur.val);
            cur = cur.next;
            counter += 1;
        }
    }

}
