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
    fun isValidBST(root: TreeNode?): Boolean {
        
        val list = ArrayList<Int>()
        
        inorderTraversal(root, list)
        for(i in 1 until list.size){
            if(list[i] <= list[i-1]) return false
        }
        return true
        
    }
    
    fun inorderTraversal(root: TreeNode?, list: ArrayList<Int>){
        if(root == null) return 
        inorderTraversal(root?.left, list)
        list.add(root?.`val`)
        inorderTraversal(root?.right, list)
    }
    
}