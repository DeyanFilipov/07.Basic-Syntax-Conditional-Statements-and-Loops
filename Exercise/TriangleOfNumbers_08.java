package BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        int n = Integer.parseInt( scanner.nextLine());

        for ( int i = 1; i <= n; i++) {
            for ( int k = 1; k <= i; k++) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
    }

}