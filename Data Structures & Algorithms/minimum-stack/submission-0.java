class MinStack {
    Stack<Pair<Integer , Integer>> st;
    public MinStack() {
        Stack<Pair<Integer , Integer>> st = new Stack<>();
        this.st = st;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
        st.push(new Pair<>(val , val));
        }
        else{
            st.push(new Pair<>(val , Math.min(val , st.peek().getValue())));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop();
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}
