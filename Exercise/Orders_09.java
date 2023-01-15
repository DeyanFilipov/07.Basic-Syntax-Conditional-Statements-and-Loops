package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        while (orders > 0) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsules = Integer.parseInt(scanner.nextLine());

            double cal = (capsules * price) * days;
            sum += cal;
            System.out.printf("The price for the coffee is: $%.2f\n", cal);
            orders--;
        }
        System.out.printf("Total: $%.2f\n", sum);
    }
}
