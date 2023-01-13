package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = new StringBuffer(user).reverse().toString();

        int loginAttempts = 1;
        String input = scanner.nextLine();
        while (!input.equals(password) && loginAttempts++ < 4) {
            System.out.printf("Incorrect password. Try again.%n");
            input = scanner.nextLine();
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", user);
        } else {
            System.out.printf("User %s blocked!", user);
        }
    }
}
