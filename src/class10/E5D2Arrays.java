package class10;

public class E5D2Arrays {
    public static void main(String[] args) {
        int[] [] matrix={
                {10,20,30,234,4324,5},
                {20,50,65,234},
                {102,54,60},
                {234,423}
        };
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}
