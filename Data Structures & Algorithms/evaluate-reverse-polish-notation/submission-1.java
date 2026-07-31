class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1 + num2);
            }
            else if(s.equals("-")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 - num1);
            }
            else if(s.equals("*")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num1 * num2);
            }
            else if(s.equals("/")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2 / num1);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.peek();
    }
}
