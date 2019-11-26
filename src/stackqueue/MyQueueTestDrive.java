package stackqueue;

public class MyQueueTestDrive {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println(queue.isEmpty());
        queue.enQueue(100);
        queue.enQueue(300);
        queue.enQueue(500);
        queue.enQueue(600);
        System.out.println(queue.Front());
        queue.deQueue();
        queue.print();
    }
}
