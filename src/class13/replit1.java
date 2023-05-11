package class13;

import java.util.Scanner;

public class replit1 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any programming language");
            String language = sc.nextLine();
            String lang="java";
            String lang1="c";
            String lang2="c++";
            if (language.equals("java")){
                System.out.println("Java is a programming language");
            }else if (language.equals("c")){
                System.out.println("C is a procedural programming language");
            }else  if (language.equals("c++")){
                System.out.println("C++ is a middle-level programming language");
            }else {
                System.out.println("Doesn't match any programming language");
            }

    }

}
