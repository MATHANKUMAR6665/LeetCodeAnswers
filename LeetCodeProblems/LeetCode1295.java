package LeetCodeProblems;

public class LeetCode1295 {
    public static void main(String[] args) {
        int[]nums ={12,345,2,6,7896,23};
        System.out.println(findnumbers(nums));

    }
    static int findnumbers(int[]nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int noofdigits=countnumbers(num);
        if (noofdigits%2==0){
            return true;
        }
        return false;
    }
    static int countnumbers(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
