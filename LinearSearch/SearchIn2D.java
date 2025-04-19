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
        int tartget=34;
        System.out.println(Arrays.toString(find(arr,tartget)));
    }
    static int []find(int[][]arr,int target){
        for (int row = 0; row <=arr.length; row++) {
            for (int coloum = 0; coloum <arr[row].length; coloum++) {
                if (arr[row][coloum]==target){
                    return new int[]{row,coloum};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
