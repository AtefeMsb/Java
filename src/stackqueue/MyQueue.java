package stackqueue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    // store elements - dynamic array
    private List<Integer> data;
    // a pointer to indicate the start position - head of the queue
    private int p_start;

    public MyQueue() {
        System.out.println("a new queue has been initialized ...");
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }
    /** Get the front item from the queue. */
    public int Front() {
        return data.get(p_start);
    }
    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }

    /** Prints the whole queue */
    public void print() {
        for (int i = p_start; i < data.size(); i++) {
            System.out.print(data.get(i) + "   ");
        }
    }
};

