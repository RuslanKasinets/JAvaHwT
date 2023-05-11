package class17;

public class Cat {

    String name;
    Cat (String catName){
        name=catName;
        System.out.println("1 argument");
    }

    Cat(){
        System.out.println("");
    }Cat(int age){
        System.out.println("kkjdfk");
    }Cat(double weight){
        System.out.println("double");
    }






    public static void main(String[] args) {
        Cat cat=new Cat("black");
    }
}
