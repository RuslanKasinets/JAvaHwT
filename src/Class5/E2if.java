package Class5;

import java.util.Scanner;

public class E2if {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("is it time to break true/false");
        boolean isbreak=input.nextBoolean();
        if (isbreak){
            System.out.println("lets have a break");
        }

    }
}
