package Class3;

import java.util.Scanner;

public class replite1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter first numbe");
        int num=scanner.nextInt();

        System.out.println("pleas enter your second number");
        int num2=scanner.nextInt();
        boolean positive=(num*num2)>=0;
        System.out.println(positive);
    }
}
