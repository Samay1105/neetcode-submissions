class Solution {
    public boolean helper(int num , HashSet<Integer> set){
        int x = num;
        int sum = 0;
        while(x>0){
            int rem = x%10;
            sum += rem*rem;
            x = x/10;
        }
        if(sum==1) return true;
        else if(set.contains(sum)) return false;

        set.add(sum);
        return helper(sum , set);
    }
    public boolean isHappy(int n) {
        return helper(n , new HashSet<>());
    }
}
