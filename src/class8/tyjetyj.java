package class8;

import java.util.Scanner;

public class tyjetyj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");
        boolean lone = scanner.nextBoolean();
        if (lone) {
            System.out.println("What is your credit score?");
        }
        int score = scanner.nextInt();
        if (score < 600) {
            System.out.println("Not eligibility");

        } else if (score > 600 && score < 700) {
            System.out.println("Maybe eligible");
        } else if (score > 700 && score < 800) {
            System.out.println("Eligible");
        } else if (score < 800) {
            System.out.println("Defenitly eligible");
        }
    }
}
