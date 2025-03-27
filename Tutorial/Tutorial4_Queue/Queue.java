/**
 *  author: Nattikorn Sae-sue, 672115014
 *  nattikorn_s@cmu.ac.th
 *  package file: QueueMain.java & Queue.java
 */

public class Queue {
    // Attributes
    private int front = 0;
    private int rear = 0;
    private int maxSize;
    private String[] queue;

    // Constructor
    public Queue(){
        this.maxSize = 0;
        this.queue = new String[maxSize];
    }
    public Queue(int size){
        this.maxSize = size;
        this.queue = new String[size];
    }

    // Method
    public int size() { // Return queue size.
        return rear-front;
    }
    public boolean isEmpty() {
        return size()==0;
    }
    public boolean isFull() {
        return rear==maxSize;
    }
    public void enqueue(String name) {
        if (isFull()) {
            System.out.println("The queue is full.");
        } else {
            queue[rear++] = name;
            System.out.println("Enqueue " + name);
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Dequeue " + queue[front]);
            queue[front++] = null;
        }
    }
    public void display() {
        System.out.print("[");
        for (int i=0; i<=maxSize-2; i++) {
            System.out.print(queue[i]+",");
        }
        System.out.print(queue[maxSize-1]+"]");
        System.out.print(" ["+"first = " + front + ", rear = " + rear + ", length = " + size() + "]\n");
    }
}
