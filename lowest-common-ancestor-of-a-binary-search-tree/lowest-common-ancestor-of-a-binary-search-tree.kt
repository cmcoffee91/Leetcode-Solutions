/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var tmp = root
        if(p != null && q != null && root != null){
            if(p?.`val` < root?.`val` && q?.`val` < root?.`val`){
              tmp = lowestCommonAncestor(root?.left, p, q)
            }
            if(p?.`val` > root?.`val` && q?.`val` > root?.`val`){
              tmp = lowestCommonAncestor(root?.right, p, q)
            }
        }
        return tmp
    }
}