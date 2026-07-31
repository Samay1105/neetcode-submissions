class Solution {
    public boolean check(char ch , char top){
        if((ch=='{' && top=='}') || (ch=='(' && top==')') || (ch=='[' && top==']')){
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                boolean ans = check(st.pop() , ch);
                //st.pop();
                if(!ans) return false;
            }
            i++;
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}
