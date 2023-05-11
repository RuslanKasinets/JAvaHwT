package class4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("pleas enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println("you entered "+gender);
    }
}
