public class CircularLinkedList {
    Node head;
    class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = this; // Point to itself initially to form a circular link
    }
}


    public CircularLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the elements of the circular linked list
    public void print() {
        if (head == null) {
            System.out.println("Circular linked list is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

   

