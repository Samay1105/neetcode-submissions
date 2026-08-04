class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;

        if(n==0) return 1;

        double num = x;
        boolean flag = false;
        if(n<0){
            flag = true;
            n = -1*n;
        }
        for(int i=1;i<n;i++){
            x = x*num;
        }
        if(flag) x = 1/x;
        return x;
    }
}
