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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val list = ArrayList<Int>()
        traverseInOrder(root, list)
        return list
    }
    
    fun traverseInOrder(root: TreeNode? , list: ArrayList<Int>){
        if(root == null) return 
        traverseInOrder(root?.left, list)
        root?.let{list.add(root.`val`)}
        traverseInOrder(root?.right, list)
       
    }
}