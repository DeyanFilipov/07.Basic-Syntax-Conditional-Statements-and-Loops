package BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstHours = Integer.parseInt(scanner.nextLine());
        int firstMinutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (firstHours * 60) + firstMinutes + 30;

        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
