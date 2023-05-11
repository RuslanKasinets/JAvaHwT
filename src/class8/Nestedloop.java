package class8;

public class Nestedloop {
    public static void main(String[] args) {
        for (int i=2;i<=2;i++){
            for (int j=2;j<=5;j++){
                for (int k=0;k<=5;k++){
                System.out.println("i"+i+" ,j:"+j+",k:"+k);
                }
            }
        }
    }
}
