package LinearSearch;

public class SeachMax {
    public static void main(String[] args) {
        int[]arr={4,7,3,2,1,9};
        System.out.println(findMIn(arr));
        System.out.println(findMax(arr));
    }
    static int findMIn(int[]arr){
        int min=arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (min>arr[index]){
                min=arr[index];
            }
        }
        return min;
    }
    static int findMax(int[]arr){
        int max=arr[0];
        for (int index = 1; index <arr.length ; index++) {
            if (max<arr[index]){
                max=arr[index];

            }

        }
        return max;
    }
}
