package BinarySearch;

public class RowColoumBoolean {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target=381;
        System.out.println(search(arr,target));
    }
    static boolean search(int[][]arr,int target){
        int Row=0;
        int Coloum=arr[Row].length-1;
        while (Row<arr.length && Coloum>=0){
            if (arr[Row][Coloum]==target){
                return true;
            }
            if (arr[Row][Coloum]<target){
                Row++;
            }else{
                Coloum--;
            }
        }
        return false;
    }
}
