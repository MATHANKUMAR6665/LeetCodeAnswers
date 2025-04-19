package LinearSearch;

public class Search1 {
    public static void main(String[]args){
        int []arr={3,5,7,9,4,1};
        int target=3;
        System.out.println(find(arr,target));
    }
    static int find(int[]arr, int target){
        //first we need to iterate the array
        //next we need to check the array elements with the target whether it is found or not
        //if it is found return the index
        //otherwise return -1
        for (int index = 0; index < arr.length; index++) {
            if (target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}
