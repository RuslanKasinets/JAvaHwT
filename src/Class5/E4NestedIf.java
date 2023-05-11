package Class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {
        int money = 20000;
        String day = "monday";
        if (money > 1000) {
            if (day.equals("Sunday")) {
                System.out.println("lets go");

            } else {
                System.out.println("lets wait for sunday");
            }
        }else {
            System.out.println("lets save more");
        }

    }
}
