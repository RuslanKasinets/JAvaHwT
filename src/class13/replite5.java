package class13;

import java.util.Scanner;

public class replite5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("give 5 names:");
        String[] names=new String[5];

        for (int i = 0; i <names.length; i++){

            names[i]=inp.nextLine();
            while (names[i].length()<3){
                System.out.println("must be 3 characters long");
                names[i]=inp.nextLine();
            }
            System.out.println(names[i].substring(0,3));




        }

    }
}
