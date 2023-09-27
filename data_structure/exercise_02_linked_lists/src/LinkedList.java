import java.util.Scanner;

public class LinkedList {
    /*
     * --> Method to check if the list is empty
     * --> Creates the parameter quantity (int qty) that refers to the amount of
     * items in the list
     */
    public static boolean emptyList(int qty) {
        /*
         * If the qty of items in the list is equal to zero, then the list is
         * empty
         */
        if (qty == 0) {
            System.out.println("Empty list");
            return true;
        } else {
            return false;
        }
    }

    /*
     * --> Method that checks if the list is full
     * --> Creates the parameters vet and qty, that referes to the qty of items in
     * the vector
     */
    public static boolean fullList(double vet[], int qty) {
        /*
         * If the qty of items in the list is equal to the vector length, then the list
         * is full
         */
        if (qty == vet.length) {
            System.out.println("The list is full!");
            return true;
        } else {
            return false;
        }
    }

    public static int insertItems(double vet[], int index, int size) {
        /*
         * Create a new object in the Scanner class (instantiate)
         * It's important not to close the scanner, if so, it's not possible to continue
         * input values.
         */
        Scanner dataInput = new Scanner(System.in);

        // Calls the method fullList and it's parameters to check if the list is full
        if (fullList(vet, index)) {
            System.out.println("The list is full and can't include new items");
        } else {
            // If the list is not full, then it's possible to add new items to it

            System.out.println("Insert a value " + (index) + " of " + size);

            /*
             * Calls the method nextDouble throught the scanner object dataInput that will
             * read the inputs and store them in a certain index (starting in 0) at the
             * vector
             */
            vet[index] = dataInput.nextDouble();

            /*
             * At which element that is added to the vector, it acrescents one more position
             * to the index. E.g: if 5 elements are added to the vector, than it's length is
             * equal to 5, that is 5 index positions
             */
            index++;
        }

        // Store the values at the qty parameter
        return index;
    }

    public static void listItems(double vet[], int qty) {
        // Calls the method emptyList and it's parameters to check if the list is empty
        if (emptyList(qty)) {
            System.out.println("Empty list");
        } else {
            /*
             * Creates the variable i, that representes the index of the vector and
             * initiates it in the position 0.
             * 
             * Compares the index with the quantity of items
             * at the list and if it's smaller than the quantity, it adds one more position
             * to the index.
             * 
             * This runs through all the for in a loop until i < qty it's not
             * true anymore, than the loop stops.
             */
            for (int i = 0; i < qty; i++) {
                System.out.println("The value stored at the position " + (i) + " is equal to " + vet[i]);
            }
        }
    }

    public static int search(double vet[], int qty) {
        /*
         * Create a new object in the Scanner class (instantiate)
         * It's important not to close the scanner, if so, it's not possible to continue
         * input values.
         */
        Scanner dataInput = new Scanner(System.in);

        /*
         * Creates the variable index and initializes it at the position -1, that is a
         * position that doesn't exists in the list
         */
        int index = -1;

        /*
         * This "if" only works when the list is not empty. While creating the method
         * emptyList, I've defined that it if the list is empty, it returns true. So
         * ONLY
         * when the list is not empty (!emptyList) it's possible to search a value in
         * it
         */
        if (!emptyList(qty)) {
            System.out.println("Insert the value that you want to search: ");
            /*
             * Calls the method nextDouble throught the scanner object dataInput that will
             * read the inputs and store them in the variable value
             */
            double value = dataInput.nextDouble();
            boolean valueNotFound = true;
            for (int i = 0; i < qty; i++) {
                if (vet[i] == value) {
                    System.out.println("The value is located at the position " + i);
                    valueNotFound = false;
                    index = i;
                }
            }

            // At deafult, valueNotFound returns true. It only returns false when vet[i] ==
            // value.
            if (valueNotFound) {
                System.out.println("Value didn't exists at the list");
            }
        }

        // Returns the index position when the method research is called
        return index;
    }

    public static double[] deleteItem(double vet[], int qty) {

        int index = search(vet, qty);

        if (index == -1)
            return vet;

        double newVet[] = new double[vet.length - 1];

        for (int i = 0, j = 0; i < vet.length; i++) {
            if (i == index) {
                continue;
            }

            newVet[j++] = vet[i];
        }
        System.out.println("Value deleted successfully");
        return newVet;

    }
}