package stackqueue;

public class MyCircularQueueTestDrive {

     public static void main(String[] args) {
          MyCircularQueue obj = new MyCircularQueue(5);
          obj.enQueue(100);
          obj.enQueue(200);
          obj.enQueue(300);
          obj.enQueue(400);
          obj.enQueue(500);

          obj.print();

          obj.deQueue();
          obj.deQueue();
          obj.deQueue();

          obj.print();

          obj.enQueue(600);
          obj.enQueue(700);

          obj.print();

          System.out.println("Front: " + obj.Front());
          System.out.println("Rear: " + obj.Rear());
          System.out.println("isEmpty: " + obj.isEmpty());
          System.out.println("isFull: " + obj.isFull());

     }
}
