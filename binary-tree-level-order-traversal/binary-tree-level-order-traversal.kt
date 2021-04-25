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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        
        
        val queue = LinkedList<TreeNode?>()
        val list = ArrayList<ArrayList<Int>>()
        if(root == null) return list
        
        queue.add(root)
        
        while(queue?.size > 0){
            val innerList = ArrayList<Int>()
            val size = queue?.size
            
            for(i in 0..size-1){
                val node = queue?.poll()
                node?.let{
                    innerList.add(node.`val`)
                }
                if(node?.left != null) queue?.add(node?.left)
                if(node?.right != null) queue?.add(node?.right)
            }
            list.add(innerList)
        }
        
        return list
        
    }
}