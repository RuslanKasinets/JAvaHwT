package slass18;

public class Task {


    String name;
    void sleep (){
        System.out.println("XXXZzzzzZZz");
    }
}
class A extends Task {

}
class b extends A{

}
class c extends  b{
    public static void main(String[] args) {
        c C=new c();
        C.sleep();
    }

}
