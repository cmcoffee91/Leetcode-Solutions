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
        inOrderTraversal(root, list)
        

        for(i in 1..list.size-1) {
            if(list.get(i) <= list.get(i-1)){ 
                return false 
            }
        }
        
           
        
        
        return true
    }
    
    fun inOrderTraversal(root: TreeNode?, list: ArrayList<Int>){
        if(root == null) return
        inOrderTraversal(root?.left, list)
        root?.let{
            list.add(root.`val`)
        }
        
        inOrderTraversal(root?.right, list)
    }
}