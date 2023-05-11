package class6;

import java.util.Scanner;

public class logicalOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");
        boolean loan=scanner.nextBoolean();
        if (loan){
            System.out.println("What is your credit score?");
            int credit=scanner.nextInt();
            if (credit<600){
                System.out.println("not eligible");
            }else if (credit>600&&credit<700){
                System.out.println("Maybe eligible");
            }else if (credit>700&&credit<800){
                System.out.println("Eligible");
            }else if (credit>800){
                System.out.println("Defenitely eligible");
            }
        }

    }
}
