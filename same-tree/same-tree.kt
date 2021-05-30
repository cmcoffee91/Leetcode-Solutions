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
        val pArray = ArrayList<Int>()
        val qArray = ArrayList<Int>()
        inorderTraversal(p, pArray)
        inorderTraversal(q, qArray)
        
        if(pArray.size != qArray.size) return false
        
        for(i in 0 until pArray.size){
            println("pArray is ${pArray[i]}")
            println("qArray is ${qArray[i]}")
            if(pArray[i] != qArray[i]) return false
        }
        
        return true
    }
    
    fun inorderTraversal(node: TreeNode?, arrayList: ArrayList<Int>){
        if(node == null) return
        node?.let{ treeNode ->
            if(treeNode.left != null){
                inorderTraversal(treeNode.left, arrayList)
            }
            else{
                arrayList.add(-1)
            }
            
            if(treeNode.right != null){
                inorderTraversal(treeNode.right, arrayList)
            }
            else{
                arrayList.add(-1)
            }
            arrayList.add(treeNode.`val`)
        }
        
    }
}