class Solution {
    public void recursion(int[] nums, List<List<Integer>> result, List<Integer> curr){
        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue;
        curr.add(nums[i]);
        recursion(nums, result, curr);
        curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        recursion(nums,result,new ArrayList<>());
        return result;
    }
}
