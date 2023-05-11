package class17;

import class13.Math;

public class Zebra {
    String name;
    String color;

    int age;
    double weight;


    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

   void  printInfo(){
       System.out.println(name+""+color+""+age+""+weight);
   }
  static void speek(){
       System.out.println("mooooo");
       Math math=new Math();
   }

}
