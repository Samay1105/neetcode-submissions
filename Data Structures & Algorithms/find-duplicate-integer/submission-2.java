class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[Math.abs(nums[i])-1]<0) return Math.abs(nums[i]);
            nums[Math.abs(nums[i])-1] *= -1;
            //if(nums[i]>0) return nums[i];
        }
        return -1;
    }
}
