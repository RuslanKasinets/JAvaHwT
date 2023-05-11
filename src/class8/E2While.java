package class8;

import java.util.Scanner;

public class E2While {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int num=scanner.nextInt();
        int counter=1;
        while (counter<=num){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
