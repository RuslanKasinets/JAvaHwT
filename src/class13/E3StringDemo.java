package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str ="dhdskjksjdhfkKDJHF6464(*&*&^%$$";
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
    }
}
