package class8;

import java.util.Scanner;

public class E3WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int num=scanner.nextInt();
        while (num!=-1){
            System.out.println("try again");
            num=scanner.nextInt();
        }


    }
}
