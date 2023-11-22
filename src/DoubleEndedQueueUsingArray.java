public class DoubleEndedQueueUsingArray {

        private int maxSize;
        private int front;
        private int rear;
        private int[] deque;
    
        public DoubleEndedQueueUsingArray(int size) {
            maxSize = size + 1;
            deque = new int[maxSize];
            front = rear = 0;
        }
    
        // Method to check if the deque is empty
        public boolean isEmpty() {
            return front == rear;
        }
    
        // Method to check if the deque is full
        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }
    
        // Method to enqueue at the front of the deque
        public void enqueueFront(int data) {
            if (isFull()) {
                System.out.println("Deque is full. Cannot enqueue at the front.");
                return;
            }
            front = (front - 1 + maxSize) % maxSize; // Move front one position to the left
            deque[front] = data;
        }
    
        // Method to enqueue at the rear of the deque
        public void enqueueRear(int data) {
            if (isFull()) {
                System.out.println("Deque is full. Cannot enqueue at the rear.");
                return;
            }
            deque[rear] = data;
            rear = (rear + 1) % maxSize; // Move rear one position to the right
        }
    
        // Method to dequeue at the front of the deque
        public void dequeueFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty. Cannot dequeue at the front.");
                return;
            }
            int data = deque[front];
            front = (front + 1) % maxSize; // Move front one position to the right
            System.out.println(data + " dequeued from the front of the deque.");
        }
    
        // Method to dequeue at the rear of the deque
        public void dequeueRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty. Cannot dequeue at the rear.");
                return;
            }
            rear = (rear - 1 + maxSize) % maxSize; // Move rear one position to the left
            int data = deque[rear];
            System.out.println(data + " dequeued from the rear of the deque.");
        }
    
        // Method to print the elements of the deque
        public void print() {
            if (isEmpty()) {
                System.out.println("Deque is empty.");
                return;
            }
    
            System.out.print("Deque: ");
            int i = front;
            while (i != rear) {
                System.out.print(deque[i] + " ");
                i = (i + 1) % maxSize;
            }
            System.out.println();
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Deque deque = new Deque(5);
    
            deque.enqueueRear(1);
            deque.enqueueRear(2);
            deque.enqueueRear(3);
    
            deque.print();
    
            deque.enqueueFront(4);
            deque.dequeueRear();
    
            deque.print();
        }
    }
    
}
