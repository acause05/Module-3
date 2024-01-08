package Example;

import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weekly income: $");
        double income = scanner.nextDouble();

        double taxRate;

        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        System.out.println("Your tax rate is: " + (taxRate * 100) + "%");

        scanner.close();
    }
}
