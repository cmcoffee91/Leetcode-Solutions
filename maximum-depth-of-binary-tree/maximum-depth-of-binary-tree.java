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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int leftHeight = 0;
        int rightHeight = 0;
        
        if(root.left != null) leftHeight = maxDepth(root.left);
        if(root.right != null) rightHeight = maxDepth(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}