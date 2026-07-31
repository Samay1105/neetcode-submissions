class Solution {
    public void recursion(int i ,int target ,int[] nums ,List<List<Integer>> result ,List<Integer> list){
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || i==nums.length) return;
        list.add(nums[i]);
        recursion(i , target-nums[i] , nums , result , list);
        list.remove(list.size()-1);
        recursion(i+1 , target , nums , result , list);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(0 , target , nums , result , new ArrayList<>());

        return result;

    }
}
