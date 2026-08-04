class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10) return digits;

            digits[i] = 0;
        }
        int[] d = new int[n+1];
       //  Arrays.fill(d , 0);
         d[0] = 1;
         return d; 
    }
}
