package HW1;

import java.util.Scanner;

public class dfgh {
    public static void main(String[] args) {
        int[] temp={23,45,56,76,87,45,};
        int largest=temp[0];
        int min=temp[0];
        for (int num:temp){
            if (num>largest){
                largest=num;
                if (num<min){
                    min=num;
            }

            }
        }System.out.println(largest+min);


            }

}



