package class12;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car();
        car.make="BMW";
        car.model="x6";
        car.color="black";
        car.mileage=0;
        car.isAutomatic=true;
        car.speed();
        car.jump();
        car.trip();



        Car car1=new Car();
        car1.make="Tesla";
        car1.model="s";
        car1.mileage=0;
        car1.color="red";
        car1.isAutomatic=true;
        car1.speed();
        car1.jump();
        car1.trip();
    }
}
