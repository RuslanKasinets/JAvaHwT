package class14;

public class E5ArrayUtill {
    boolean contains(int []arr,int num){
        boolean isFound=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                isFound=true;

            }

        }return  isFound;
    }

    public static void main(String[] args) {
        int[] arr={10,20,45};
        int num=20;
        E5ArrayUtill obj=new E5ArrayUtill();
        boolean result=obj.contains(arr,num);

        System.out.println(result);
    }
}
