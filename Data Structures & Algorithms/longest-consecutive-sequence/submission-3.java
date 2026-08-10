class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);

        int longest = 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int cnt = 1;
                int x = num;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest = Math.max(cnt , longest);
            }
        }
        return longest;
    }
}
