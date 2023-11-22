class QueueUsingArray {
        private static final int MAX_SIZE = 10;
        private int[] array;
        private int front;
        private int rear;
    
        public QueueUsingArray() {
            this.array = new int[MAX_SIZE];
            this.front = -1;
            this.rear = -1;
        }
    
        
        public void enqueue(int data) {
            if (rear == MAX_SIZE - 1) {
                System.out.println("Queue is full. Cannot enqueue.");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear++;
            array[rear] = data;
        }
    
        
        public void dequeue() {
            if (front == -1) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }
    
        
        public int getFront() {
            if (front == -1) {
                System.out.println("Queue is empty. No front element.");
                return -1; 
            }
            return array[front];
        }
    
        
        public int getRear() {
            if (rear == -1) {
                System.out.println("Queue is empty. No rear element.");
                return -1; 
            }
            return array[rear];
        }
    
        
        public void print() {
            if (front == -1) {
                System.out.println("Queue is empty.");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
    

