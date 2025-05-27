package BinarySearch;

import java.util.Arrays;

public class RowColoumMatrix {
    public static void main(String[]args){
        int[][]arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=382;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    /*basically we are going to search the row and coloum wise checks so that
        this is the sorted array like it is well sorted row wise and coloum wise
        so we can go with this approach so this will be helpfull
        first we are take the row as 0
        second we take the coloum as arr.length-1
        why means we are going to serach with the row wise forward and the coloum wise
        backward so we can finally we get the answer.
     */
    static int[]search(int[][]arr,int target){
        int Row=0;
        int COloum= arr[Row].length-1;
        while (Row<arr.length &&COloum>=0){
            if (arr[Row][COloum]==target){
                return new int[]{Row,COloum};
            }
            if (arr[Row][COloum]<target){
                Row++;
            }else{
                COloum--;
            }
        }
        return new int[]{-1,-1};
    }
}
