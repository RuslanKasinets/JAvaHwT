package HW1;

public class HW6 {
    public static void main(String[] args) {
        int [][] num={{2,3,3,8,6},
                      {2,4,5,12},
                      {1,1,2,16}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2 == 0)
                System.out.println(num [i][j]);


            }

        }
    }
}
