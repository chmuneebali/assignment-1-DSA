public class StackUsingLL {

    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    class Stack {
        private Node top;
    
        public Stack() {
            this.top = null;
        }
    
        
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            System.out.println(data + " pushed to stack");
        }
    
    
        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop");
                return;
            }
            int popped = top.data;
            top = top.next;
            System.out.println(popped + " popped from stack");
        }
    
        
        public boolean isEmpty() {
            return top == null;
        }
    
        
        public void print() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            Node current = top;
            System.out.print("Stack: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        
        public int peak() {
            if (isEmpty()) {
                System.out.println("Stack is empty. No peak element.");
                return -1; 
            }
            return top.data;
        }
    
        
        public boolean isFull() {
            return false;
        }
    }
    
}