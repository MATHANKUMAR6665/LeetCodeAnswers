package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[]args){
        int[]arr={4,3,5,2,1};
        int[]arr1={0,3,1};

        cyclicSOrt(arr1);
        System.out.println(Arrays.toString(arr1));

    }
    static void cyclicSOrt(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            int Correct = arr[i];
            if (arr[i]<arr.length&&arr[i] == arr[Correct]) {
                i++;
            } else {
                swap(arr,i,Correct);
            }
        }
    }
    static void swap(int[]arr,int start,int end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

}
