class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res , 1);
        int pre = nums[0];
        for(int i=0;i<n;i++){
            if(i==0) continue;
            res[i] = pre;
            pre *= nums[i];
        }
        int suff = nums[n-1];
        for(int i = n-1;i>=0;i--){
            if(i==n-1) continue;
            res[i] *= suff;
            suff *= nums[i];
        }
        return res;
    }
}  
