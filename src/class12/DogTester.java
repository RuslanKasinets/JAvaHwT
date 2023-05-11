package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog=new Dog();
        actualDog.name="Jaky";
        actualDog.age=20;
        actualDog.breed="German";
        actualDog.color="black";
        actualDog.weight=50;
        actualDog.bark();


        Dog obj=new Dog();

        actualDog.name="Lacy";
        actualDog.age=40;
        actualDog.breed="usa";
        actualDog.color="green";
        actualDog.weight=23;
        actualDog.eat();


    }
}
