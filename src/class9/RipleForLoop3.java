package class9;

import java.util.Scanner;

public class RipleForLoop3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        for (int i=num;i>0;i--){
            System.out.print(i+" ");

        }
    }
}
