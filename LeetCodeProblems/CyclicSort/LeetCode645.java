package LeetCodeProblems.CyclicSort;

import java.util.Arrays;

public class LeetCode645 {
    public static void main(String[]args){
        int[]arr={2,2};
        System.out.println(Arrays.toString(findErrorNUmbers(arr)));
    }
    static int []findErrorNUmbers(int[]arr){
        int i=0;
        int[] ans=new int[2];
        while (i<arr.length){
            int CorrectIndex=arr[i]-1;
            if(arr[i]!=arr[CorrectIndex]){
                swap(arr,i,CorrectIndex);
            }else{

                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans= new int[]{arr[j],j+1};

            }

        }
        return ans;
    }
    static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
