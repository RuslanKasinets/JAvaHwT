package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.next();
        if (name.equals("elena")){
            System.out.println("mac user");
        }else  if (name.equals("sofia")){
            System.out.println("naughty");
        }
    }
}
