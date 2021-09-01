/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        
        if(root == null) return root
        val left = root.left
        val right = root.right
        root.left = right 
        root.right = left 
        invertTree(root.left)
        invertTree(root.right)
       
        return root
        
    }
}