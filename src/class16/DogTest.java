package class16;

import class13.Math;

public class DogTest {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.breed="German";
        obj.color="black";
        obj.name="Jack";

        Dog obj1=new Dog();
        obj1.breed="Italy";
        obj1.color="black";
        obj1.name="Sam";
        obj1.printInfo();


        Dog.age=20;
        Dog.printInfo2();
        obj.age=30;

    }
}
