package LeetCodeProblems.CommonProblems;

public class Leetcode125 {
    public static void main(String[] args) {
        String name="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(name));
    }

        static boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
            for(int i=0;i<s.length()/2;i++){
                char start=s.charAt(i);
                char end=s.charAt(s.length()-i-1);
                if(start!=end){
                    return false;
                }
            }
            return true;
        }
    }

