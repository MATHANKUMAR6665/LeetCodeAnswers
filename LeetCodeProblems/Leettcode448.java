package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//today


public class Leettcode448 {
    public static void main(String[]args){
        int[]arr={4,3,2,7,8,2,3,1};
        System.out.println(missingElements(arr));
    }
    static List<Integer>missingElements(int[]arr){
        int i=1;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if (arr[i]==arr[correctindex]){
                i++;
            }else{
                swap(arr,i,correctindex);
            }
        }
        List<Integer>ans=new ArrayList<Integer>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    static void swap(int[]arr,int first,int second){
        int Temp=arr[first];
        arr[first]=arr[second];
        arr[second]=Temp;
    }

}
