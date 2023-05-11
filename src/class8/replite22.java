package class8;

import java.util.Scanner;

public class replite22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean wether=scanner.nextBoolean();
        if (wether){
            System.out.println("It is sunny day I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temp=scanner.nextInt();
            if (temp>85){
                System.out.println("I am going to the beach");
            }else if (temp<85){
                System.out.println("I am going to the park");
            }

            ;}
    }
}
