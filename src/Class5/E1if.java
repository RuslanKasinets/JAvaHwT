package Class5;

import java.util.Scanner;

public class E1if {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter your mark");
        int grad=scanner.nextInt();
        if (grad>=1&&grad<25){
            System.out.println("F");

        }else if(grad>=25&&grad<45){
            System.out.println("E");
        }else if(grad>=45&&grad<50){
            System.out.println("D");
        }else if(grad>=50&&grad<60){
            System.out.println("C");
        }else if(grad>=60&&grad<80){
            System.out.println("B");
        }else if(grad>80){
            System.out.println("A");}}}









