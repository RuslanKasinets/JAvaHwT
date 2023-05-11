package class13;

public class E4StringDemo {
    public static void main(String[] args) {
        String str="tuday is sunday.we heve Java? we like java";
        String[]strAtt=str.split("[.!?]");
        System.out.println(strAtt.length);
        System.out.println(strAtt[2].trim());

    }
}
