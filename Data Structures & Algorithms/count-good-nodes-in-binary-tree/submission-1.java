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
    int cnt = 0;
    public int nodes(TreeNode root , int max){
        if(root==null) return 0;

        if(root.val>=max){
            cnt++;
            max = Math.max(max , root.val);
        }
        int left = nodes(root.left , max);
        int right = nodes(root.right , max);

        return cnt;
    }
    public int goodNodes(TreeNode root) {
        return nodes(root , Integer.MIN_VALUE);
    }
}
