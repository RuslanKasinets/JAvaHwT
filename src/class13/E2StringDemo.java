package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="SEf3$*(&FS3445678AFdsfs&%66$&";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","%"));
        System.out.println(str.replaceAll("[1-9]","&"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[*]","A-z"));
        char c='a';
        c++;
        System.out.println(c);



    }
}

