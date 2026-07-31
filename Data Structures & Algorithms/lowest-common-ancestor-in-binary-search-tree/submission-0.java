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
    public TreeNode find(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;

        if(root.val==p.val || root.val==q.val) return root;

        TreeNode lft = find(root.left , p , q);
        TreeNode rgt = find(root.right , p , q);

        if(lft!=null && rgt!=null){ return root;}

        if(lft==null) return rgt;
        
        return lft;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root , p , q);
    }
}