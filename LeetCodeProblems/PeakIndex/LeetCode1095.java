package LeetCodeProblems.PeakIndex;

public class LeetCode1095 {
    public static void main(String[]args){
        int[]arr={4,5,6,7,0,1,2};
        int target=44;
        System.out.println(search(arr,target));

    }
    static int search(int[]arr,int target){
        int peak=peakFinding(arr);
        int search1=orderAgnosticSearch(arr,target,true,0,peak);
        int  search2=orderAgnosticSearch(arr,target,true,peak+1,arr.length-1);
        if (search1!=-1){
            return search1;
        }
        return search2;
    }
    static int peakFinding(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end =mid;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
    static int orderAgnosticSearch(int[]arr,int target,boolean isAsc,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
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
