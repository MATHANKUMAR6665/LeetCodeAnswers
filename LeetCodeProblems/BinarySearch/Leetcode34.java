package LeetCodeProblems.BinarySearch;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[]args){
        int[]arr={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int []search(int[]arr,int target){
        int[]ans= {-1,-1};
        int start=findstartandend(arr,target,true);
        int end=findstartandend(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int findstartandend(int[]arr,int target,boolean isFirst){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if (target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if (isFirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
