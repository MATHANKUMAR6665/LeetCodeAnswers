package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]args){
        int []arr={3,2,4,5,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[]arr){
        boolean swap=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }
    }
}
