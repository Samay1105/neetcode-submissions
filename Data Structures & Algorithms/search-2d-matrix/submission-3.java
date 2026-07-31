class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length , col = matrix[0].length;
        int l = 0 , h = col-1;
        while(l<row){
            if(matrix[l][h]>=target){
                int i = 0,j=col-1;
                while(i<=j){
                    int mid = i + (j-i)/2;
                    if(matrix[l][mid]==target) return true;

                    else if(matrix[l][mid]>target) j = mid-1;

                    else i = mid+1;
                }
            }
            l++;
        }
        return false;
    }
}
