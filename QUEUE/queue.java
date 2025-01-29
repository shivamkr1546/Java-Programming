package QUEUE;

public class queue {
    static class Queue {
        int[] arr;
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = 0;
            rear = -1;
        }

        // isEmpty
        public boolean isEmpty() {
            return rear < front;
        }

        // isFull
        public boolean isFull() {
            return rear == size - 1;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int frontData = arr[front];
            front++; // Increment front pointer
            // Reset the queue if it becomes empty
            if (front > rear) {
                front = 0;
                rear = -1;
            }
            return frontData;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
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
