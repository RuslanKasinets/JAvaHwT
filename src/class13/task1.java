package class13;

public class task1 {
    public static void main(String[] args) {
        String str="Java";
        if (!str.isBlank()&&str.length()%2!=0 && str.length()>=3){
            int middle=str.length()/2;
            char middleChar=str.charAt(middle);
            System.out.println(middle);
        }
    }
    //String str=new String("Java");


}
