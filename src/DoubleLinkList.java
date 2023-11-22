public class DoubleLinkList{
    class Node {
        int data;
        Node next;
        Node prev;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    
        private Node head;
    
        public DoubleLinkList() {
            this.head = null;
        }
    
        // Method to insert a node at the end of the doubly linked list
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
        }
    
        // Method to print the doubly linked list
        public void print() {
            Node current = head;
            System.out.print("Doubly Linked List: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    
    
    
