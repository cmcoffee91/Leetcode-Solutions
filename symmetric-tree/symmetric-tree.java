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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> leftQueue = new LinkedList<TreeNode>();
        Queue<TreeNode> rightQueue = new LinkedList<TreeNode>();
        
        leftQueue.add(root);
        rightQueue.add(root);
        
        while(leftQueue.size() > 0){
            TreeNode leftNode = leftQueue.poll();
            TreeNode rightNode = rightQueue.poll();
            
            if(leftNode == null && rightNode == null)  continue;
            if(leftNode == null || rightNode == null || leftNode.val != rightNode.val) return false;
            
            leftQueue.add(leftNode.left);
            leftQueue.add(leftNode.right);
            
            rightQueue.add(rightNode.right);
            rightQueue.add(rightNode.left);
        }
        
        return true;
        
    }
}