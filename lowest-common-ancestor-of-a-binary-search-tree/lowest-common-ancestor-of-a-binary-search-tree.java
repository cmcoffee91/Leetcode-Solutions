/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int leftVal = p.val;
        int rightVal = q.val;
        
        if(leftVal > parentVal  && rightVal > parentVal) return lowestCommonAncestor(root.right, p, q);
        if(leftVal < parentVal  && rightVal < parentVal) return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}