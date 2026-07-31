class Solution {
    public int trap(int[] height) {
        int i = 0 , j = height.length-1;
        int left = 0 , right = 0 , water = 0;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>left){
                    left = height[i];
                }
                else{
                    water += left - height[i];
                }
                i++;
            }
            else{
                if(height[j]>right){
                    right = height[j];
                }
                else{
                    water += right - height[j];
                }
                j--;
            }
        }
        return water;
    }
}
