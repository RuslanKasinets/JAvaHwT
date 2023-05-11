package class6;

import java.util.Scanner;

public class practis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your height inches");
        int height=scanner.nextInt();
        if (height<60){
            System.out.println("short");

        }else if (height>=60&&height<=70){
            System.out.println("midium");
        }else {
            System.out.println("tall");
        }
    }
}
