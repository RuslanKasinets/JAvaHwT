package Class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int yourNumber= scanner.nextInt();
        int counter=1;

        while (counter<=yourNumber){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
