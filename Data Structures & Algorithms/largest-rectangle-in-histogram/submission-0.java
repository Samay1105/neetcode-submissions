class Solution {
    public int[] pse(int[] arr , int n){
        int[] num = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) num[i] = -1;
            else num[i] = st.peek();

            st.push(i);
        }
        return num;
    }
    public int[] nse(int[] arr , int n){
        Stack<Integer> st = new Stack<>();
        int[] num = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) num[i] = n;
            else num[i] = st.peek();

            st.push(i);
        }
        return num;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ps = pse(heights , n);
        int[] ns = nse(heights , n);
        int max = 0;
        for(int i=0;i<n;i++){
            int num = heights[i]*(ns[i] - ps[i] - 1);
            max = Math.max(num , max);
        }
        return max;
    }
}
