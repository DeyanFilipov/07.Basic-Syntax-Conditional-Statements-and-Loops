package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mid = 0;
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num1 == max && num3 == min || num3 == max && num1 == min) {
            mid = num2;
        } else if (num2 == max && num3 == min || num2 == min && num3 == max) {
            mid = num1;
        } else {
            mid = num3;
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
        }
    }