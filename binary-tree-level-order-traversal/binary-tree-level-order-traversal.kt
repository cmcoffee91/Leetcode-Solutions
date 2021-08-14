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
        
        val outerList = ArrayList<List<Int>>()
        if(root == null) return outerList
        
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        
        while(queue.size > 0){
            val size = queue.size
            val innerList = ArrayList<Int>()
            for(i in 0 until size){
                val treeNode = queue.poll()
                treeNode?.let{
                    innerList.add(treeNode.`val`)
                    treeNode.left?.let{ leftChild ->
                        queue.add(leftChild)
                    }
                    treeNode.right?.let{ rightChild ->
                        queue.add(rightChild)
                    }
                }
            }
            outerList.add(innerList)
        }
        
        return outerList
    }
}