package class9;

public class E4Arrays {
    public static void main(String[] args) {
        String []names={"Ivan","rusla","zak","maria"};
       for (int n=0;n<names.length;n++ ){
           System.out.print(names[n]+", ");
       }
        System.out.println();
       int counter=0;
       while (counter<names.length){
           System.out.println(names[counter]);
           counter++;
       }
    }

}
