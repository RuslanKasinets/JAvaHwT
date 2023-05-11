package class9;

public class EArrays {
    public static void main(String[] args) {
      int[] num={1,2,3,4,5};
        for (int i=0;i<=5;i+=2) {
            if (i%2==0) {
                System.out.println(num[i]);
            }
        }
    }
}
