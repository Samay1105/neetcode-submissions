class Solution {
    public int maxArea(int[] heights) {
        int i=0 , j=heights.length-1 , max=0;
        while(i<j){
            int area = Math.min(heights[i],heights[j]);
            area = area*(j-i);
            if(heights[i]<=heights[j]) i++;
            else j--;

            max = Math.max(area , max);
        }
        return max;
    }
}
