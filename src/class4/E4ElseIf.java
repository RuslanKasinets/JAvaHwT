package class4;

public class E4ElseIf {
    public static void main(String[] args) {
        String fruit = "apple";
        if (fruit.equals("orange")) {
            System.out.println("you pay $12");
        } else if (fruit.equals("banana")) {
            System.out.println("you pay $5");
        } else if (fruit.equals("apple")) {
            System.out.println("you pay $4");
        } else {
            System.out.println("this fruit not available");
        }
    }
}
