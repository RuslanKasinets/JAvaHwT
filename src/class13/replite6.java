package class13;

import java.util.Scanner;

public class replite6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        for(int i=0;i<word.length();i++){
            if (word.charAt(i)=='a'||word.charAt(i)=='e'){
                System.out.println(word.charAt(i));}
        }
    }
}
