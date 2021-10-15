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
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0
        val left = maxDepth(root.left) + 1
        val right = maxDepth(root.right) + 1
        return Math.max(left, right) 
    }
}