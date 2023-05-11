package HW1;

public class HW2 {
    public static void main(String[] args) {
        String[][] cars = {{"Ford", "Chevrolet", "Dodge"}, {"BMW", "Mercedes-Benz", "Volkswagen"}, {"Hyundai", "Kia", "Genesis"}, {"Ferrari", "Lamborghini", "Maserati"}};

// Loop 1: Nested for loop
        for(int i = 0; i < cars.length; i++) {
            for(int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }

// Loop 2: Enhanced for loop
        for(String[] brand : cars) {
            for(String model : brand) {
                System.out.println(model);
            }
        }

    }
}
