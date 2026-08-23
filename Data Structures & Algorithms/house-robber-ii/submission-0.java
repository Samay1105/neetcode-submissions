class Solution {
    public int rec(int i, int[] nums, int[] dp) {
        if (i == 0)
            return nums[i];
        if (i < 0)
            return 0;

        if (dp[i] != -1) {
            return dp[i];
        }
        int pick = nums[i] + rec(i - 2, nums, dp);
        int notpick = 0 + rec(i - 1, nums, dp);

        return dp[i] = Math.max(pick, notpick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] temp1 = new int[n - 1];
        int[] temp2 = new int[n - 1];
        int dp1[] = new int[n - 1];
        int dp2[] = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                temp1[j] = nums[i];
                j++;
            }

            if (i != n - 1) {
                temp2[k] = nums[i];
                k++;
            }
        }
        return Math.max(rec(n - 2, temp1, dp1), rec(n - 2, temp2, dp2));
    }
}