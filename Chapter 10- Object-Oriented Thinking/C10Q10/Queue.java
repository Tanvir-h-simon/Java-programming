public class Queue {
    private int[] elements;
    private int size;

    // Constructor with default capacity 8
    public Queue() {
        elements = new int[8];
        size = 0;
    }

    // Add an element to the queue
    public void enqueue(int v) {
        // If the array is full, resize it
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        // Add the element at the end of the queue
        elements[size++] = v;
    }

    // Remove and return the first element from the queue
    public int dequeue() {
        if (empty()) {
            throw new RuntimeException("Queue is empty");
        }

        // Get the first element
        int element = elements[0];

        // Shift all elements to the left
        System.arraycopy(elements, 1, elements, 0, size - 1);
        size--;

        return element;
    }

    // Check if the queue is empty
    public boolean empty() {
        return size == 0;
    }

    // Get the size of the queue
    public int getSize() {
        return size;
    }
}