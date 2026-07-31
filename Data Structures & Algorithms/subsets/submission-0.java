class Solution {
    public void recursion(int i, int[] nums, List<List<Integer>> result, List<Integer> curr){
        if(i==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        recursion(i+1, nums, result, curr);
        curr.remove(curr.size()-1);
        recursion(i+1, nums, result, curr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(0, nums, result, new ArrayList<>());
        return result;
    }
}
