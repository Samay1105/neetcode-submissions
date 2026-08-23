class Solution {
    public int rec(int i , int[] cost , int[] dp){
        if(i>=cost.length){ 
            return 0;
        }
            if(dp[i]!=-1) return dp[i];
        int one = cost[i] + rec(i+1 , cost , dp);
        int two = cost[i]  + rec(i+2 , cost , dp);

        return  dp[i] = Math.min(one , two);
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        return Math.min(rec(0 , cost , dp) , rec(1 , cost , dp));
    }
}
