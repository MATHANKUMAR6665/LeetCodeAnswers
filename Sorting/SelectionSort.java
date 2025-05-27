package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selection(arr);
        System.out.println(max(arr));
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int lastindex=arr.length-i-1;
            int max=findmax(arr,0,lastindex);
            swap(arr ,max,lastindex);
        }
    }
    static int findmax(int[]arr,int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[start]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int max(int[]arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=i;
            }
        }
        return max;
    }
}

