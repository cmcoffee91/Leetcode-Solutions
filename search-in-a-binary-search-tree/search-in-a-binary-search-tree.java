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
    
    private TreeNode foundNode  = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        dfs(root, val);
        return foundNode;
    }
    
    public void dfs(TreeNode root, int val){
        if(root == null) return;
      
        if(root.left != null)dfs(root.left, val);
          
        if(root.val == val){
            foundNode = root;
            return;
        } 
        
        if(root.right != null)dfs(root.right, val);
        
    }
}