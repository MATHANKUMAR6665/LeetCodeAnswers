package LeetCodeProblems.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode287 {
    public static void main(String[]args){
        int[]arr={1,3,4,7,8,7,2,2};
        System.out.println(search(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if (nums[i]!=i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }
    static List<Integer>search(int[]nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    ans.add(i);
                    return ans;
                }
            } else {
                i++;
            }
        }
        return ans;
    }

    static void swap(int[]arr,int first,int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }
}
