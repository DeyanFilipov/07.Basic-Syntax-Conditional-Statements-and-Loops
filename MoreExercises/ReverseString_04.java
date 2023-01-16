package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reveredInput = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            reveredInput = currentChar+reveredInput;
        }
        System.out.println(reveredInput);
    }
}
