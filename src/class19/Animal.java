package class19;

public class Animal {
     String name="jack";
    String color;
    int age;
    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
}


    }

    class  Dog extends Animal {
    double price;
    public Dog(String name, String color, int age,double price){
        super(name,color,age);
        this.price=price;

    }


}


class Cat extends Animal{


    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
}
class Horse extends Animal{

    public Horse(String name, String color, int age) {
        super(name, color, age);
    }
}
class AnimalTester{
    public static void main(String[] args) {



    Dog dog=new Dog("tom","black",23,33);
    dog.printInfo();
}}