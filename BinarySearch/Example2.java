package BinarySearch;

public class Example2 {
    public static void main(String[] args) {
        int[]arr={98,87,76,65,54,43,32,0,-1,};
        int target=985;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            //this is descending order array so we need to alter some things according to this
            if(target>arr[mid]){
                end=mid-1;
            }else if(target<arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
