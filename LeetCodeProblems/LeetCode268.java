package LeetCodeProblems;
//today
public class LeetCode268 {
    public static void main(String[]args){
        int[]arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if (nums[i]<nums.length&& nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[]arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
