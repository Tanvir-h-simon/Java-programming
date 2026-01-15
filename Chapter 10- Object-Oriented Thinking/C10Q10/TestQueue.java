public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Add 20 numbers from 1 to 20 into the queue
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }

        System.out.println("De-queuing elements:");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}