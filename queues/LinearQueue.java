package queues;

/*
 * The disadvantage of liniear queue is that it is not efficient in terms of memory
 * once dequeued an that place cannot be used again
 */

public class LinearQueue {

    int[] queue;
    int size;
    int front = -1;
    int rear = -1;

    public LinearQueue(int size) {
        this.size = size;
        this.queue = new int[size];
    }

    public void enqueue(int element) {
        if (isEmpty()) {
            front++;
            queue[++rear] = element;
        } else {
            if (!isFull()) {
                queue[++rear] = element;
            } else {
                System.out.println("queue is full!");
            }
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return queue[front++];
        }

    }

    public int currentFrontElement() {
        if (!isEmpty())
            return queue[front];
        else
            return -1;
    }

    public int[] getFullQueue() {
        return queue;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

}