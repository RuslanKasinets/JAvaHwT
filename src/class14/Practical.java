package class14;

public class Practical {
    int sumArr(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0);
            sum+=arr[i];


        }return sum;
    }

    public static void main(String[] args) {
        Practical obj=new Practical();
        int[] name={12,23,45,6,2};
        int result=obj.sumArr(name);
        System.out.println(result);

    }


}

