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
        if(root == null) return false;   
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root.left);
        queue.add(root.right);
        
        while(!queue.isEmpty()){
           TreeNode one = queue.poll(); 
           TreeNode two = queue.poll(); 
           
           if(one == null && two == null) continue;
           if(two == null || one == null) return false;
           if(one.val != two.val) return false;
            
           queue.add(one.left);
           queue.add(two.right);
            
           queue.add(two.left);
           queue.add(one.right);
        }
        
        return true;
    }
}