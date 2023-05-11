package slass18;

public class Person {
    String name;
    void  sleep (){
        System.out.println("ZZZZzzzzzZZ");
    }

}
class Employee extends  Person{

}
class Tester extends  Employee{

}
class  PersonTEster{
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.sleep();

    }
}