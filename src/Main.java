import java.util.Scanner;
public class Main {
public static void main(String[] args) throws Exception {
    //     SingleLinkList  sLL = new SingleLinkList ();
    //     StackUsingArray stackArr = new StackUsingArray();
    //     StackUsingLL stackLL = new StackUsingLL();
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a number to enter in the link list at first postion = ");
    //     int userInput  = scanner.nextInt();
    //     sLL.addFirst("2");
    //     sLL.addLast("3");
    //     sLL.addLast("4");
    //     sLL.addLast("5");
    //     sLL.addFirst(userInput);
    //     System.out.println("Enter a postion = ");
    //     int postion  = scanner.nextInt();
    //     scanner.nextLine();
    //     System.out.println("Enter a data you want to enter at  " + postion+" = ");
    //     String data = scanner.nextLine();
    //     sLL.addRandom(data, postion);
    //     sLL.print();
    //     sLL.deleteFirst();
    //     sLL.print();
    //     sLL.deleteLast();
    //     sLL.print();
    //     System.out.println("Enter position to delete the node");
    //     int dPosition = scanner.nextInt();
    //     scanner.nextLine();
    //     sLL.deleteRandom(dPosition);
    //     stackArr.push(userInput);
    //     stackArr.push(4);
    //     stackArr.print();
    //     stackArr.pop();
    //     stackArr.print();
    //     stackArr.peak();
    //     stackLL.push();
    //     stackLL.pop();
    //     stackLL.print();
    //     stackLL.peak();
    //     sll.search;
    //     CircularLinkedList circularLinkedList = new CircularLinkedList();

    //     circularLinkedList.insert(1);
    //     circularLinkedList.insert(2);
    //     circularLinkedList.insert(3);
    //     circularLinkedList.insert(4);

    //     System.out.println("Circular Linked List:");
    //     circularLinkedList.print();
    //     DoubleLinkList dLL = new DoubleLinkList();
    
    //         dLL.insert(1);
    //         dLL.insert(2);
    //         dLL.insert(3);
    
    //         dLL.print();
    //         QueueUsingArray qArray = new QueueUsingArray();
    //         qArray.enqueue(dPosition);
    //         qArray.dnqueue();
    //         qArray.getFront();
    //         qArray.getRear();
    //         qArray.print();

    //         QueuUsingLinkList qLL = new QueuUsingLinkList();
    //         qll.enqueue();
    //         qLL.dequeue();
    //         qLL.getFront();
    //         qLL.getRear()
    //         qLL.print();
    //         CircularQueueUsingArray circularQueue = new CircularQueueUsingArray();
    //         circularQueue.enqueue(1);
    //         circularQueue.enqueue(2);
    //         circularQueue.enqueue(3);
    
    //         circularQueue.print();
    
    //         circularQueue.dequeue();
    //         circularQueue.getFront();
    //         circularQueue.getRear();
    
    //         circularQueue.print();
    // }
    // DoubleEndedQueueUsingArray Deque = new DoubleEndedQueueUsingArray(size);
    // deque.enqueueRear(1);
    // deque.enqueueRear(2);
    // deque.enqueueRear(3);

    // deque.print();

    // deque.enqueueFront(4);
    // deque.dequeueRear();

    // deque.print();
        Scanner scanner = new Scanner(System.in);
        int choice1;

        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Linked List");
            System.out.println("2. Stack");
            System.out.println("3. Queue");
            System.out.println("0. Exit");

            choice1 = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice1) {
                case 1:
                    System.out.println("Choose a type of Linked List:");
                    System.out.println("a. Single");
                    System.out.println("b. Double");
                    System.out.println("c. Circular");

                    char choice2 = scanner.next().charAt(0);
                    scanner.nextLine(); // consume the newline character

                    switch (choice2) {
                        case 'a':
                            // Single Linked List operations
                            int choice;
        do {
            System.out.println("Choose an operation on Single Linked List:");
            System.out.println("1. Add at the beginning");
            System.out.println("2. Add at the end");
            System.out.println("3. Add at a specific position");
            System.out.println("4. Print");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add at the beginning: ");
                    String dataBegin = scanner.nextLine();
                    sLL.addFirst(dataBegin);
                    break;
                case 2:
                    System.out.print("Enter data to add at the end: ");
                    String dataEnd = scanner.nextLine();
                    sLL.addLast(dataEnd);
                    break;
                case 3:
                    System.out.print("Enter data to add: ");
                    String dataRandom = scanner.nextLine();
                    System.out.print("Enter position to add at: ");
                    int position = scanner.nextInt();
                    sLL.addRandom(dataRandom, position);
                    scanner.nextLine(); // consume the newline character
                    break;
                case 4:
                    System.out.println("Linked List:");
                    sLL.print();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
        break;
                        case 'b':
                            // Double Linked List operations
                            DoubleLinkList dLL = new DoubleLinkList();
                            int choice;
        do {
            System.out.println("Choose an operation on Double Linked List:");
            System.out.println("1. Insert");
            System.out.println("2. Print");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int dataInsert = scanner.nextInt();
                    dLL.insert(dataInsert);
                    dLL.print();
                    break;
                case 2:
                    System.out.println("Double Linked List:");
                    dLL.print();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
                            break;
                        case 'c':
                            // Circular Linked List operations
                            CircularLinkedList circularLinkedList = new CircularLinkedList();
                            int choice;
        do {
            System.out.println("Choose an operation on Double Linked List:");
            System.out.println("1. Insert");
            System.out.println("2. Print");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int dataInsert = scanner.nextInt();
                    circularLinkedList.insert(dataInsert);
                    circularLinkedList.print();
                    break;
                case 2:
                    System.out.println("Double Linked List:");
                    circularLinkedList.print();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 2:
                    System.out.println("Choose a type of Stack:");
                    System.out.println("a. Array-based");
                    System.out.println("b. Linked List-based");

                    char choice3 = scanner.next().charAt(0);
                    scanner.nextLine(); // consume the newline character

                    switch (choice3) {
                        case 'a':
                            // Array-based Stack operations
                            StackUsingArray stackArr = new StackUsingArray();
                            int choice;
                            do {
                                System.out.println("Choose an operation on Array-based Stack:");
                                System.out.println("1. Get Front");
                                System.out.println("2. Get Rear");
                                System.out.println("3. Print");
                                System.out.println("4. Peak");
                                System.out.println("5. Push");
                                System.out.println("6. Pop");
                                System.out.println("0. Exit");
                    
                                choice = scanner.nextInt();
                                scanner.nextLine(); // consume the newline character
                    
                                switch (choice) {
                                    case 1:
                                        stackArr.getFront();
                                        break;
                                    case 2:
                                        stackArr.getRear();
                                        break;
                                    case 3:
                                        stackArr.print();
                                        break;
                                    case 4:
                                        stackArr.peak();
                                        break;
                                    case 5:
                                        System.out.print("Enter data to push: ");
                                        int dataPush = scanner.nextInt();
                                        stackArr.push(dataPush);
                                        break;
                                    case 6:
                                        stackArr.pop();
                                        break;
                                    case 0:
                                        System.out.println("Exiting program.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }
                    
                            } while (choice != 0);
                            break;
                        case 'b':
                            // Linked List-based Stack operations
                            StackUsingLL stackLL = new StackUsingLL();
                            // Perform operations on stackLL...
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Choose a type of Queue:");
                    System.out.println("a. Array-based");
                    System.out.println("b. Linked List-based");
                    System.out.println("c. Circular");

                    char choice4 = scanner.next().charAt(0);
                    scanner.nextLine(); // consume the newline character

                    switch (choice4) {
                        case 'a':
                            // Array-based Queue operations
                            QueueUsingArray qArray = new QueueUsingArray();
                            // Perform operations on qArray...
                            break;
                        case 'b':
                            // Linked List-based Queue operations
                            QueuUsingLinkList qLL = new QueuUsingLinkList();
                            // Perform operations on qLL...
                            break;
                        case 'c':
                            // Circular Queue operations
                            CircularQueueUsingArray circularQueue = new CircularQueueUsingArray();
                            // Perform operations on circularQueue...
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice1 != 0);
    }
}

}