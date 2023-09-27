import java.util.Scanner;

public class ProductData {
    public String name;
    public double price;
    public int unitiesBought;
    public int clientsNumber;
    public double total = 0;

    public void dataStorage() {
        Scanner dataInput = new Scanner(System.in);

        System.out.printf("Product name: ");
        name = dataInput.nextLine();

        System.out.printf("Product price: ");
        price = dataInput.nextDouble();

        System.out.printf("Unities bought: ");
        unitiesBought = dataInput.nextInt();

        System.out.printf("Number of clients: ");
        clientsNumber = dataInput.nextInt();

        dataInput.close();

        finalPriceCalculus();

    }

    public void finalPriceCalculus() {
        total = price * unitiesBought / clientsNumber;

        if (unitiesBought >= 11 && unitiesBought <= 20) {
            total -= (total * 0.1);
        } else if (unitiesBought >= 21 && unitiesBought <= 50) {
            total -= (total * 0.2);
        } else if (unitiesBought > 50) {
            total -= (total * 0.25);
        }
        System.out.printf(name + "\n" + "$" + "%,.2f", total);
    }
}
