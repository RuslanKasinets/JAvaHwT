package class6;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your day");
        int day=scanner.nextInt();
        if (day<5){
            System.out.println(day+" It is weekday");
        }else if (day<6 && day>7){
            System.out.println(day+" it a weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}
