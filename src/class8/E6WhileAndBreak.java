package class8;

import java.util.Scanner;

public class E6WhileAndBreak {
    public static void main(String[] args) {
        boolean sumer=true;
        int temp=85;
        while (sumer){
            if (temp<100){
                System.out.println("its good");
            }
            else {
                System.out.println("its wery hot");
            }break;

        }temp=temp+2;
    }
}
