package LeetCodeProblems;

public class Leetcode367 {
    public static void main(String[] args) {
        int n=16;
    }
    static boolean find(int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int a=1;
            if(a*a==n){
                return true;
            }
            if (a*a<n){

            }
        }
        return false;
    }
}
