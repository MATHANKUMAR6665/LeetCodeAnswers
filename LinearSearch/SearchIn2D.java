package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][]arr={
                {24,4,1},
                {18,12,3,9},
                {98,99,34,56},
                {18,12}
        };
        int tartget=341;
        System.out.println(Arrays.toString(search(arr,tartget)));
    }
    static int[] search(int[][]arr,int target){
        if (arr.length==0){
            return new int[]{-1,-1};

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
