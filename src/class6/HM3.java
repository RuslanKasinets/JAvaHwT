package class6;

import java.util.Scanner;

public class HM3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your day birthdsay");
        String month=scanner.next();
        if (month.equals("March ")||(month.equals("April")||(month.equals("May")))){
            System.out.println("Spring");
        }else if (month.equals("June")||month.equals("July")||month.equals("August")){
            System.out.println("Summer");
        }else if (month.equals("December")||month.equals("January")||month.equals("Februaru")){
            System.out.println("Winter");
        }





    }
}
