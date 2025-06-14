package LeetCodeProblems.CommonProblems;

public class Leetcode9 {
    public static void main(String[] args) {
        int x = 1211;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        while (x > 0) {
            int remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;

        }
        return original == reversed;
    }
}

