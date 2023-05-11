package Class7;

import java.util.Scanner;

public class notClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your First name ");
        String name=scanner.next();



        System.out.println("please enter your Last name ");
        String lastName=scanner.next();
        System.out.println("enter your age");
        int age=scanner.nextInt();

        System.out.println("your full name is " +name+" " +lastName+"your age is"+age );

    }
}
