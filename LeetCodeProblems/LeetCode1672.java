package LeetCodeProblems;

public class LeetCode1672 {
    public static void main(String[] args) {
        int[][]accounts={
                {1,5},{7,3},{3,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++) {
                sum = sum+accounts[i][j];
            }
                if(sum>ans){
                    ans=sum;
                }


        }
        return ans;

    }
}
