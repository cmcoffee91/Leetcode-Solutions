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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        val queue = LinkedList<TreeNode?>()
        
        queue.offer(p)
        queue.offer(q)
        
        while(queue.size > 0){
            val one = queue.poll()
            val two = queue.poll()
            
            if(one == null && two == null) continue
            if(one == null || two == null) return false
            if(one.`val` !=  two.`val`) return false
            
            queue.offer(one.left)
            queue.offer(two.left)
            queue.offer(one.right)
            queue.offer(two.right)
            
        }
        
        return true
    }
}