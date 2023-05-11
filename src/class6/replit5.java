package class6;

import java.util.Scanner;

public class replit5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int num=scanner.nextInt();
        if (num>0){
        System.out.println(num+" is positive");

        }else if (num<0){
            System.out.println(num+" is negative");
        }else {
            System.out.println("Entered number is equals to 0");
        }

    }
}
