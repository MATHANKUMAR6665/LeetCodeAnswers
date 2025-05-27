package BinarySearch;

public class Rbs {
    public static void main(String[]args){
        int[] arr={4,5,6,7,8,0,1,2};
        System.out.println(pivotsearch(arr));
    }
    static int search(int[]arr,int target) {
        int picvot=pivotsearch(arr);
        int search =binarySearch(arr,target,0,picvot);
        if (search!=-1){
            return search;
        }
        return binarySearch(arr,target,picvot+1,arr.length-1);
    }
    static int binarySearch(int[]arr,int target,int start,int end){
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
          return -1;
        }

    static int pivotsearch(int[]arr){
        int start=0;
        int end=arr.length-1;
        while ((start<end)){
            int mid=start+(end-start)/2;
            if (arr[mid]>=arr[mid+1]){
                return mid;
            }
            if (arr[mid]<=arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    }


