public class SingleLinkList  {
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
    public void addRandom(String data,int postion){
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("LL is empty Inserting at the front of the Linked List");
            head = newNode;
            return;
        }
        Node currNode = head;
        int currPostion = 0; 
        while ( currNode != null && currPostion < postion-1) {
            currNode = currNode.next;
            currPostion++;
        }
        if (currNode == null) {
            System.out.println("The LL is not long enough");
            return;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        System.out.println(data + " Inserted at the postion " + postion +"\n");
    }

    public void print(){
        if (head == null) {
            System.out.println("The list is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
        System.out.println("The next node  =  Null");
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The LL is empty,Nothing to be deleted");
            return;
        }
        Node temNode = head;
        head = head.next;
        temNode.next = null;
        System.out.println("Deleted first Node "+ temNode.data);
    }
    
    public void deleteLast(){
        if (head == null) {
            System.out.println("The LL is empty, Nothing to bde deleted");
            return;
        }
        if(head.next == null){
                System.out.println("There is only one item ,Deleted "+ head.data);
                head = null;
                return;
        }
        Node currNode = head;
        Node prevNode = null;
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        prevNode.next = null;
        System.out.println("Deleted Last Node "+ currNode.data);
    }

    public void deleteRandom(int postion){
        if (head == null) {
            System.out.println("The LL is empty, Nothing to bde deleted");
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        int currPostion = 0;
        while (currNode != null &&  currPostion < postion) {
            prevNode = currNode;
            currNode = currNode.next;
            currPostion++;
        }
        if (currNode == null) {
            System.out.println("the node is not found at : " + postion);
            return;
        }
        if (prevNode == null) {
            head = currNode.next;
            return;
        } else {
            prevNode.next = currNode.next;
            currNode.next = null;    
        }
        
        System.out.println("Deleted Node at position : "+postion+ "Node :" + currNode.data);
    }

    public void search(String value) {
        if (head == null) {
            System.out.println("the LL is empty");
            return;
        }
        Node current = head;
        int position;
        while (current != null) {
            if (current.data == value) {
                position++;
                System.out.println("the data  si fond at teh postin: "+ position); 
            
            }
            current = current.next;
        }
     System.out.println('data iss not  found inhte LL');
    }
}