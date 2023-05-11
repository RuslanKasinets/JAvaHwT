package class8;

import java.util.Scanner;

public class ItnIntInt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int counter=start;
        while (counter<=end){
            System.out.print(counter+" ");
            counter++;
        }

    }
}
