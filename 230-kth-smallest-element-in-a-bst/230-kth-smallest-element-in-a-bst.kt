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
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val list = ArrayList<Int>()
        val stack = Stack<TreeNode?>()
        
        var temp = root
        var indexToFind = k
        
        while(temp != null || stack.size > 0){
            while( temp != null){
               stack.push(temp)
               temp = temp.left
            }
            temp = stack.pop()
            
            temp?.let{
                if(--indexToFind == 0) return it.`val`
            }
            temp = temp?.right
        }
        
        return -1
    }
    
    fun inorderTraversal(list: ArrayList<Int>, root: TreeNode?){
        if(root == null) return
        
        inorderTraversal(list, root.left)
        list.add(root.`val`)
        inorderTraversal(list, root.right)
    }
}