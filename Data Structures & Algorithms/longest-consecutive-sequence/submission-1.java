class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max = 1;
        for(int num:nums){
            if(!set.contains(num-1)){
                int x = num , cnt = 1;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                max = Math.max(max , cnt);
            }
        }
        return max;
    }
}
