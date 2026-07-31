/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int num = -1 , cnt=0;
    public int recur(TreeNode root , int k){
        if(root==null) return 0;
        recur(root.left , k );
        cnt++;
        if(k==cnt) num =  root.val;
        recur(root.right , k);

        return num;

    }
    public int kthSmallest(TreeNode root, int k) {
        return recur(root , k);
        
        
    }
}
