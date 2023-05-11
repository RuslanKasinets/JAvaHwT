package class8;

import java.util.Scanner;

public class UYGUF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your favorite car make: ");
        String carMake = input.nextLine().toLowerCase();
        String carOrigin;

        switch (carMake) {
            case "bmw":
                carOrigin = "German car";
                break;
            case "toyota":
                carOrigin = "Japanese car";
                break;
            case "maserati":
                carOrigin = "Italian car";
                break;
            default:
                carOrigin = "Unknown";
                break;
        }

        System.out.println("Your favorite car is " + carOrigin);
    }
}

