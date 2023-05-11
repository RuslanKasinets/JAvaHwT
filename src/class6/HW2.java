package class6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your time");
        int time=scanner.nextInt();
        if (time<11){
            System.out.println("Morning");
        }else if (time>=12&&time<=15){
            System.out.println("afternoon");
        }else  if (time>=16&&time<=20){
            System.out.println("Evening");
        }else if (time>=21&&time<=24){
            System.out.println("night");
        }
    }
}
