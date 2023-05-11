package class15;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {

//    Task 4: Grade Calculator
//
//    Write a Java program that takes three integer inputs and outputs the largest of the three numbers.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter your gender:M or F");
        char gender=scanner.next().charAt(0);
        System.out.println("Pleas enter your age");
        int age=scanner.nextInt();


        if(age >25){
            if (gender=='F'){
                System.out.println("Women");
            }else {
                System.out.println("Man");
            }

        }else {
            if (gender=='F'){
                System.out.println("Girl");

            }else {
                System.out.println("Boy");
            }
        }
        }}


















