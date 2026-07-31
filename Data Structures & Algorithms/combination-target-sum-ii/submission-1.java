class Solution {
    public void recursion(int j, int[] candidates, int target, List<List<Integer>> result, List<Integer> curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=j;i<candidates.length;i++){
            if(i>j && candidates[i]==candidates[i-1]) continue;
            if(target<candidates[i]) break;
            curr.add(candidates[i]);
            recursion(i+1 , candidates , target-candidates[i], result , curr);
            curr.remove(curr.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        recursion(0 , candidates , target , result , new ArrayList<>());
        return result;

    }
}
