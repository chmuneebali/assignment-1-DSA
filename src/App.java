public class App {
    Node  head;
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("The list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode);
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) throws Exception {
        App list = new App();
        list.addFirst("1");
        list.addFirst("2");
        list.addLast("3");
        list.print();
    }
}
