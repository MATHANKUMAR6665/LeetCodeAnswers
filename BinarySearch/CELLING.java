package BinarySearch;

public class CELLING {
    public static void main(String[]args){
        int[]arr={2,3,5,9,14,16,18};
        int Target=15;
        System.out.println(search(arr,Target));
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return  mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
