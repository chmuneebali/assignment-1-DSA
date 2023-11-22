public class QueuUsingLinkList {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
        private Node front;
        private Node rear;
    
        public QueuUsingLinkList() {
            this.front = null;
            this.rear = null;
        }
    
        
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }
    
        
        public void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return;
            }
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = front.next;
            }
        }
    
        
        public int getFront() {
            if (front == null) {
                System.out.println("Queue is empty. No front element.");
                return -1; 
            }
            return front.data;
        }
    
        
        public int getRear() {
            if (rear == null) {
                System.out.println("Queue is empty. No rear element.");
                return -1; 
            }
            return rear.data;
        }
    
        
        public void print() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return;
            }
            Node current = front;
            System.out.print("Queue: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    

