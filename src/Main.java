import java.util.Scanner;
public class Main {
public static void main(String[] args) throws Exception {
        SingleLinkList  list = new SingleLinkList ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to enter in the link list at first postion = ");
        String userInput  = scanner.nextLine();
        list.addFirst("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addFirst(userInput);
        System.out.println("Enter a postion = ");
        int postion  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a data you want to enter at  " + postion+" = ");
        String data = scanner.nextLine();
        list.addRandom(data, postion);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
        System.out.println("Enter position to delete the node");
        int dPosition = scanner.nextInt();
        scanner.nextLine();
        list.deleteRandom(postion);
    }

}