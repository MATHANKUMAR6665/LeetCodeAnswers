package BinarySearch;

public class AgnosticSearch {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8,9};
        int[]arr1={98,87,76,65,54,32,12,11,0,-1,-2};
        int target=87;
        System.out.println(search(arr1,target));
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else{
                if (target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
