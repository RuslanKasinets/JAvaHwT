package Class5;

import java.util.Scanner;

public class E3ifElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("you  can drive");
        } else {
            System.out.println("you  cant drive");
        }

    }
}