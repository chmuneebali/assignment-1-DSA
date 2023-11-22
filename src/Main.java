import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    scanner.nextLine();

                    switch (choice2) {
                        case 'a':
                            // Single Linked List operations
                            SingleLinkList sLL = new SingleLinkList();
                            int choiceSingle;
                            do {
                                System.out.println("Choose an operation on Single Linked List:");
                                System.out.println("1. Add at the beginning");
                                System.out.println("2. Add at the end");
                                System.out.println("3. Add at a specific position");
                                System.out.println("4. Print");
                                System.out.println("0. Exit");

                                choiceSingle = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceSingle) {
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
                                        scanner.nextLine();
                                        break;
                                    case 4:
                                        System.out.println("Linked List:");
                                        sLL.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Single Linked List operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceSingle != 0);
                            break;

                        case 'b':
                            // Double Linked List operations
                            DoubleLinkList dLL = new DoubleLinkList();
                            int choiceDouble;
                            do {
                                System.out.println("Choose an operation on Double Linked List:");
                                System.out.println("1. Insert");
                                System.out.println("2. Print");
                                System.out.println("0. Exit");

                                choiceDouble = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceDouble) {
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
                                        System.out.println("Exiting Double Linked List operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceDouble != 0);
                            break;

                        case 'c':
                            // Circular Linked List operations
                            CircularLinkedList circularLinkedList = new CircularLinkedList();
                            int choiceCircular;
                            do {
                                System.out.println("Choose an operation on Circular Linked List:");
                                System.out.println("1. Insert");
                                System.out.println("2. Print");
                                System.out.println("0. Exit");

                                choiceCircular = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceCircular) {
                                    case 1:
                                        System.out.print("Enter data to insert: ");
                                        int dataInsert = scanner.nextInt();
                                        circularLinkedList.insert(dataInsert);
                                        circularLinkedList.print();
                                        break;
                                    case 2:
                                        System.out.println("Circular Linked List:");
                                        circularLinkedList.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Circular Linked List operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceCircular != 0);
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Choose a type of Stack:");
                    System.out.println("a. Array-based");
                    System.out.println("b. Linked List-based");

                    char choice3 = scanner.next().charAt(0);
                    scanner.nextLine();

                    switch (choice3) {
                        case 'a':
                            // Array-based Stack operations
                            StackUsingArray stackArr = new StackUsingArray();
                            int choiceStackArr;
                            do {
                                System.out.println("Choose an operation on Array-based Stack:");
                                System.out.println("1. Get Front");
                                System.out.println("2. Get Rear");
                                System.out.println("3. Print");
                                System.out.println("4. Peak");
                                System.out.println("5. Push");
                                System.out.println("6. Pop");
                                System.out.println("0. Exit");

                                choiceStackArr = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceStackArr) {
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
                                        System.out.println("Exiting Array-based Stack operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceStackArr != 0);
                            break;

                        case 'b':
                            // Linked List-based Stack operations
                            StackUsingLL stackLL = new StackUsingLL();
                            int choiceStackLL;
                            do {
                                System.out.println("Choose an operation on Linked List-based Stack:");
                                System.out.println("1. Get Front");
                                System.out.println("2. Get Rear");
                                System.out.println("3. Print");
                                System.out.println("4. Peak");
                                System.out.println("5. Push");
                                System.out.println("6. Pop");
                                System.out.println("0. Exit");

                                choiceStackLL = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceStackLL) {
                                    case 1:
                                        stackLL.getFront();
                                        break;
                                    case 2:
                                        stackLL.getRear();
                                        break;
                                    case 3:
                                        stackLL.print();
                                        break;
                                    case 4:
                                        stackLL.peak();
                                        break;
                                    case 5:
                                        System.out.print("Enter data to push: ");
                                        int dataPush = scanner.nextInt();
                                        stackLL.push(dataPush);
                                        break;
                                    case 6:
                                        stackLL.pop();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Linked List-based Stack operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceStackLL != 0);
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Choose a type of Queue:");
                    System.out.println("a. Array-based");
                    System.out.println("b. Linked List-based");
                    System.out.println("c. Circular");
                    System.out.println("d. Double-ended");

                    char choice4 = scanner.next().charAt(0);
                    scanner.nextLine();

                    switch (choice4) {
                        case 'a':
                            // Array-based Queue operations
                            QueueUsingArray qArray = new QueueUsingArray();
                            int choiceQueueArr;
                            do {
                                System.out.println("Choose an operation on Array-based Queue:");
                                System.out.println("1. Enqueue");
                                System.out.println("2. Dequeue");
                                System.out.println("3. Get Front");
                                System.out.println("4. Get Rear");
                                System.out.println("5. Print");
                                System.out.println("0. Exit");

                                choiceQueueArr = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceQueueArr) {
                                    case 1:
                                        System.out.print("Enter data to enqueue: ");
                                        int dataEnqueue = scanner.nextInt();
                                        qArray.enqueue(dataEnqueue);
                                        break;
                                    case 2:
                                        qArray.dequeue();
                                        break;
                                    case 3:
                                        qArray.getFront();
                                        break;
                                    case 4:
                                        qArray.getRear();
                                        break;
                                    case 5:
                                        qArray.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Array-based Queue operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceQueueArr != 0);
                            break;

                        case 'b':
                            // Linked List-based Queue operations
                            QueuUsingLinkList qLl = new QueuUsingLinkList();
                            int choiceQueueLL;
                            do {
                                System.out.println("Choose an operation on Linked List-based Queue:");
                                System.out.println("1. Enqueue");
                                System.out.println("2. Dequeue");
                                System.out.println("3. Get Front");
                                System.out.println("4. Get Rear");
                                System.out.println("5. Print");
                                System.out.println("0. Exit");

                                choiceQueueLL = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceQueueLL) {
                                    case 1:
                                        System.out.print("Enter data to enqueue: ");
                                        int dataEnqueue = scanner.nextInt();
                                        qLl.enqueue(dataEnqueue);
                                        break;
                                    case 2:
                                        qLl.dequeue();
                                        break;
                                    case 3:
                                        qLl.getFront();
                                        break;
                                    case 4:
                                        qLl.getRear();
                                        break;
                                    case 5:
                                        qLl.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Linked List-based Queue operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceQueueLL != 0);
                            break;

                        case 'c':
                            // Circular Queue operations
                            CircularQueueUsingArray circularQueue = new CircularQueueUsingArray();
                            int choiceCircularQueue;
                            do {
                                System.out.println("Choose an operation on Circular Queue:");
                                System.out.println("1. Enqueue");
                                System.out.println("2. Dequeue");
                                System.out.println("3. Get Front");
                                System.out.println("4. Get Rear");
                                System.out.println("5. Print");
                                System.out.println("0. Exit");

                                choiceCircularQueue = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceCircularQueue) {
                                    case 1:
                                        System.out.print("Enter data to enqueue: ");
                                        int dataEnqueue = scanner.nextInt();
                                        circularQueue.enqueue(dataEnqueue);
                                        break;
                                    case 2:
                                        circularQueue.dequeue();
                                        break;
                                    case 3:
                                        circularQueue.getFront();
                                        break;
                                    case 4:
                                        circularQueue.getRear();
                                        break;
                                    case 5:
                                        circularQueue.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Circular Queue operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceCircularQueue != 0);
                            break;

                        case 'd':
                            // Double-ended Queue operations
                            DoubleEndedQueueUsingArray dQueueArr = new DoubleEndedQueueUsingArray();
                            int choiceDoubleEndedQueue;
                            do {
                                System.out.println("Choose an operation on Double-ended Queue:");
                                System.out.println("1. Enqueue Front");
                                System.out.println("2. Enqueue Rear");
                                System.out.println("3. Dequeue Front");
                                System.out.println("4. Dequeue Rear");
                                System.out.println("5. Get Front");
                                System.out.println("6. Get Rear");
                                System.out.println("7. Print");
                                System.out.println("0. Exit");

                                choiceDoubleEndedQueue = scanner.nextInt();
                                scanner.nextLine();

                                switch (choiceDoubleEndedQueue) {
                                    case 1:
                                        System.out.print("Enter data to enqueue at the front: ");
                                        int dataEnqueueFront = scanner.nextInt();
                                        dQueueArr.enqueueFront(dataEnqueueFront);
                                        break;
                                    case 2:
                                        System.out.print("Enter data to enqueue at the rear: ");
                                        int dataEnqueueRear = scanner.nextInt();
                                        dQueueArr.enqueueRear(dataEnqueueRear);
                                        break;
                                    case 3:
                                        dQueueArr.dequeueFront();
                                        break;
                                    case 4:
                                        dQueueArr.dequeueRear();
                                        break;
                                    case 5:
                                        dQueueArr.getFront();
                                        break;
                                    case 6:
                                        dQueueArr.getRear();
                                        break;
                                    case 7:
                                        dQueueArr.print();
                                        break;
                                    case 0:
                                        System.out.println("Exiting Double-ended Queue operations.");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please try again.");
                                }

                            } while (choiceDoubleEndedQueue != 0);
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
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
