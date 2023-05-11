package class20;

public class Perent {

    void  getMerry(){
        System.out.println("Marry to the girl");
    }
    private  void accessingBank(){
        System.out.println();
    }


    static  void PrintNumber(){
        System.out.println(10);
    }
}
class  Alex extends Perent{
    static void printNumber(){
        System.out.println(20);
    }


    void  getMarry(){
        System.out.println("I want to marry ");
    }
}
class  ParentTester{
    public static void main(String[] args) {
        Alex alex=new Alex();
        alex.getMarry();


    }
}