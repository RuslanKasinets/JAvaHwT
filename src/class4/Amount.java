package class4;

import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Pleas enter how many amount you need");
        int amount=s.nextInt();
        if (amount<=20000)
            System.out.println("you are qualified for the loan");
        else
            System.out.println("You need to lent the money");

    }
}
