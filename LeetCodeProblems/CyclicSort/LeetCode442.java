package LeetCodeProblems.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode442 {
    public static void main(String[]args){
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicate(arr));
        System.out.println(Arrays.toString(arr));

    }
    static List<Integer> findDuplicate(int[]arr){
        int i=0;
        List<Integer>ans=new ArrayList<>();
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
                ans.add(arr[j]);

            }
        }
        return ans;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
