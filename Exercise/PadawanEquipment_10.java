package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double totalLightSaberPrice = Math.ceil(students + 0.1 * students) * priceLightSaber;
        double totalRobesPrice = students * priceRobe;
        double totalBeltPrice = students * priceBelt;
        int freeBelt = students / 6;

        double totalPrice = totalLightSaberPrice + totalRobesPrice + (totalBeltPrice - (freeBelt * priceBelt));
        if (balance >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - balance);
        }
    }
}
