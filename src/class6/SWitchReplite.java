package class6;

import java.util.Scanner;

public class SWitchReplite {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System .out.println("Enter the roll number of the Child");
        int num=scanner.nextInt();
        switch (num){
            case 101:
                System. out.println("Student name: Ramesh");
                break;
            case 102:
                System. out.println("Student name: Mahesh");
                break;
            case 103:
                System. out.println("You can Dance");
                break;
            default:
                System.out.println("Not found Student name: in Class");
    }}
}
