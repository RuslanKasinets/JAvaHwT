package class9;

import java.util.Scanner;

public class E12ArreasScanner {
    public static void main(String[] args) {

        int[] numbers=new int[3];
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i<numbers.length;i++){

            numbers[i]=scanner.nextInt();
        }
        for (int number:numbers){
            System.out.println(number);
        }
    }
}