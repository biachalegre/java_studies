import java.text.DecimalFormat;
import java.util.Scanner;

public class Bhaskara {
    public double a;
    public double b;
    public double c;
    public double root1;
    public double root2;
    public double delta;

    public void dataStorage() {
        Scanner dataInput = new Scanner(System.in);

        System.out.printf("Insert the value of a: ");
        a = dataInput.nextDouble();

        System.out.printf("Insert the value of b: ");
        b = dataInput.nextDouble();

        System.out.printf("Insert the value of c: ");
        c = dataInput.nextDouble();

        dataInput.close();

        rootCalculus();
    }

    public void rootCalculus() {
        DecimalFormat df = new DecimalFormat("#.##");
        double deltaRoot;
        delta = Math.pow(b, 2) - 4 * a * c;
        deltaRoot = Math.sqrt(delta);
        root1 = (-b + deltaRoot) / 2 * a;
        root2 = (-b - deltaRoot) / 2 * a;

        if (delta < 0) {
            System.out.println("Doesn't exist real roots to delta negative values");
        } else if (delta == 0) {
            System.out.println("The equation root is: " + df.format(root1));
        } else {
            System.out.println("The equations roots are: " + df.format(root1) + " and " + df.format(root2));
        }
    }
}
