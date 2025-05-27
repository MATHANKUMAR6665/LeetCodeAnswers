package LinearSearch;

import java.util.Arrays;

public class SumOFTwoNumbers {
    public static void main(String[]args){
        int []nums = {2,7,11,15};
        int target=13;
        System.out.println(Arrays.toString(addnumbers(nums, target)));
    }
    static int[]addnumbers(int[]arr,int target){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                ans=arr[i]+arr[j];
                if (target==ans){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
