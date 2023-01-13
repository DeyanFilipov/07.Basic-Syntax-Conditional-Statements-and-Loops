package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;
        switch (groupType) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 8.45;
                        break;
                    case "Saturday":
                        pricePerPerson = 9.8;
                        break;
                    case "Sunday":
                        pricePerPerson = 10.46;
                        break;
                }
                if (peopleInGroup >= 30) {
                    pricePerPerson *= 0.85;
                }
                break;
            case "Business":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 10.9;
                        break;
                    case "Saturday":
                        pricePerPerson = 15.6;
                        break;
                    case "Sunday":
                        pricePerPerson = 16;
                        break;
                }
                if (peopleInGroup >= 100) {
                    peopleInGroup -= 10;
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        pricePerPerson = 15;
                        break;
                    case "Saturday":
                        pricePerPerson = 20;
                        break;
                    case "Sunday":
                        pricePerPerson = 22.5;
                        break;
                }
                if (peopleInGroup >= 10 && peopleInGroup <= 20) {
                    pricePerPerson *= 0.95;
                }
                break;
        }
        double totalPrice = peopleInGroup * pricePerPerson;
        System.out.printf("Total price: %.2f", totalPrice);

    }
}