public class CircularQueueUsingArray {

        private int maxSize;
        private int front;
        private int rear;
        private int[] queue;
    
        public CircularQueueUsingArray(int size) {
            maxSize = size + 1; // One extra space is needed for the circular aspect
            queue = new int[maxSize];
            front = rear = 0;
        }
    
        // Method to check if the circular queue is empty
        public boolean isEmpty() {
            return front == rear;
        }
    
        // Method to check if the circular queue is full
        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }
    
        // Method to enqueue an element into the circular queue
        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue.");
                return;
            }
            queue[rear] = data;
            rear = (rear + 1) % maxSize;
        }
    
        // Method to dequeue an element from the circular queue
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }
            int data = queue[front];
            front = (front + 1) % maxSize;
            System.out.println(data + " dequeued from the queue.");
        }
    
        // Method to get the front element of the circular queue without removing it
        public void getFront() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No front element.");
                return;
            }
            System.out.println("Front element: " + queue[front]);
        }
    
        // Method to get the rear element of the circular queue without removing it
        public void getRear() {
            if (isEmpty()) {
                System.out.println("Queue is empty. No rear element.");
                return;
            }
            System.out.println("Rear element: " + queue[(rear - 1 + maxSize) % maxSize]);
        }
    
        // Method to print the elements of the circular queue
        public void print() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
    
            System.out.print("Circular Queue: ");
            int i = front;
            while (i != rear) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
            }
            System.out.println();
        }
    }

