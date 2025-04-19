package LinearSearch;

import java.util.Arrays;

public class MaxIN2D {
    public static void main(String[] args) {
        int[][]arr={
                {24,4,1},
                {18,12,3,9},
                {98,99,34,56},
                {18,12}
        };
        System.out.println(intsearch(arr));
    }
    static int intsearch(int[][]arr){
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
