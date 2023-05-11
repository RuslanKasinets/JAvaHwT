package Class5;

import java.util.Scanner;

public class ifPract {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num=scanner.nextInt();
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num>num1) {
            if (num > num2) {
                System.out.println("The largest number is " + num);

            }


        }else if (num1>num){
            if(num1>num2){
                System.out.println("The largest number is"+num1);
            }
        }else if(num2>num){
            if(num2>num1){
                System.out.println("The largest number is"+num2);
            }
        }
    }

}
