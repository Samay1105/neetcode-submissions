class Solution {
    public int rec(int i , int[] nums , int[] dp){
        if(i==0) return nums[i];
        if(i<0) return 0;

        if(dp[i]!= -1){
            return dp[i];
        }
        int pick = nums[i] + rec(i-2 , nums , dp);
        int notpick = 0 + rec(i-1 , nums , dp);

        return dp[i] = Math.max(pick , notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , -1);
        return rec(n-1 , nums , dp);
    }
}
