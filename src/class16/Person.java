package class16;

import java.util.Scanner;

public class Person {
    private String name="Vasja";

    String SSN="2342424234";
    private String password;
    public static double bankBalance=12000;
    void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }


    public static void main(String[] args) {
        Person ruslan=new Person();
        ruslan.password="1234";
        ruslan.printPassword();
        System.out.println(bankBalance);
        System.out.println(ruslan.name);

    }
}
