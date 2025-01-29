package QUEUE;

public class cirQueue {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            // Add first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];
            // Reset queue if last element is removed
            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
