package HW1;

public class ArraysLoop {
    public static void main(String[] args) {
        String[][]name = {{"Ford", "Chevrolet", "Dodge"}, {"BMW", "Mercedes-Benz", "Volkswagen"}, {"Hyundai", "Kia", "Genesis"}, {"Ferrari", "Lamborghini", "Maserati"}};
        for (int i =0; i < name.length; i++) {
            for (int j=0;j<name[i].length;j++){
            System.out.println(name[i][j]);}

        }
        System.out.println();
        int counter=0;
        while (counter<name.length){
            for (int j = 0; j < name.length; j++) {


            System.out.print(name[counter][j]+"");
            }counter++;
        }
    }
}
