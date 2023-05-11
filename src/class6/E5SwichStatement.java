package class6;

import java.util.Scanner;

public class E5SwichStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number between 1 and 9: ");
        int day = input.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("It is a weekday");
        } else if (day >= 6 && day <=9) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }


        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 10) {
            System.out.println("The number is small");
        } else if (num >= 11 && num <= 546) {
            System.out.println("The number is medium");
        } else if (num >= 101 && num <= 1000) {
            System.out.println("The number is large");
        } else {
            System.out.println("The number is out of range");
        }

        input.close();

    }
}
