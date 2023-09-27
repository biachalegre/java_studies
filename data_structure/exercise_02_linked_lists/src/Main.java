import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new object in the Scanner class (instantiate)
        Scanner dataInput = new Scanner(System.in);

        int size = 5;
        // Creates the vector where the values will be stored
        double items[] = new double[size];

        int option = 0;
        int qty = 0;

        while (option != 5) {
            System.out.println(" ");
            System.out.println("Choose one of the following options: ");
            System.out.println("1- Insert item");
            System.out.println("2- List items");
            System.out.println("3- Search items");
            System.out.println("4- Delete items");
            System.out.println("5- Exit");
            System.out.println(" ");

            option = dataInput.nextInt();

            switch (option) {
                case 1:
                    qty = LinkedList.insertItems(items, qty, size);
                    break;
                case 2:
                    LinkedList.listItems(items, qty);
                    break;
                case 3:
                    LinkedList.search(items, qty);
                    break;
                case 4:
                    items = LinkedList.deleteItem(items, qty);
                    if (items.length != qty)
                        qty = items.length;
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invaled option!");
                    break;
            }
        }

        dataInput.close();
    }
}
