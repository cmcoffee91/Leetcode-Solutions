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
        
        val outerList = ArrayList<ArrayList<Int>>()
        if(root == null) return outerList
        
        
        val queue = LinkedList<TreeNode>()
        
        queue.offer(root)
        
        while(queue.size > 0){
            val size = queue.size
            val innerList = ArrayList<Int>()
            
            for(i in 0 until size){
               val node = queue.poll() 
               node?.let{
                   innerList.add(it.`val`)
                   it.left?.let{ left ->
                       queue.offer(left)
                   }
                   it.right?.let{ right ->
                       queue.offer(right)
                   }
               }
            }
            
            outerList.add(innerList)
            
        }
        return outerList
        

        
    }
}