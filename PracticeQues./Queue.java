public class Queue {
    private int[] arr;
    private int size;
    private int rear = -1;

    // Constructor
    Queue(int n) {
        arr = new int[n];
        size = n;
    }

    // Check if empty
    public boolean isEmpty() {
        return rear == -1;
    }

    // Add (enqueue)
    public void add(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // Remove (dequeue)
    public int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }

        int front = arr[0];

        // Shift elements left
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // Peek (front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return arr[0];
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
