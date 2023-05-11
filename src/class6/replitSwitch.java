package class6;

import java.util.Scanner;

public class replitSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("do you want drink?");
        boolean water=scanner.hasNextBoolean();
        if (water){
            System.out.println();
        }
    }
}
