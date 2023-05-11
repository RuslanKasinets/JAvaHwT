package class14;

public class E4arrayUtils {
    int add(int a,int b){
        int sum=a+b;
        return  sum;
    }

    public static void main(String[] args) {
        E4arrayUtils obj=new E4arrayUtils();
        int sum=obj.add(10,20);
        System.out.println(sum);
    }

}
