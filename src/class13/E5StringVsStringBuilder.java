package class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {



        String str1="This is sentence i want to reverse";

        StringBuilder str2=new StringBuilder(str1);
        System.out.println(str2);
        str2.reverse();
        str1=str2.toString();
        System.out.println(str1);












    }
}
