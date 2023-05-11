package HW2StringDemo;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String givenString = inp.nextLine();
        givenString = givenString.replaceAll("", "").toLowerCase();


        boolean isPalindrome = true;
        int len = givenString.length();
        for (int i = 0; i < len / 2; i++) {
            if (givenString.charAt(i) != givenString.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);


        }
    }

