class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int j = 0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                res[j] = nums[dq.peekFirst()];
                j++;
            }
        }
        return res;
    }
}
