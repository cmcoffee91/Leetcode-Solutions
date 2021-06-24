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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> rightSide = new ArrayList<Integer>();
        if( root == null ) return rightSide;
        queue.add(root);
        while(queue.size() > 0){
            int size = queue.size();
            for(int i = 0;i < size; i++){
                TreeNode node = queue.poll();
                if(i == size - 1) rightSide.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        
        return rightSide;
    }
}