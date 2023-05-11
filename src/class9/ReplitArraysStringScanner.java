package class9;

import java.util.Scanner;

public class ReplitArraysStringScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Pleas enter day of the wek");
        String []week={"Sunday","Monday","Tuesday","wednesday","thursday","friday","Saturday"};
        int day=scanner.nextInt();
        System.out.println(week[day]);

        }
    }

