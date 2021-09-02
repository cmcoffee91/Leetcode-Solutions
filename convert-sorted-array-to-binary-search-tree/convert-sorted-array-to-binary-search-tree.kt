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
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        
        var left = 0
        var right = nums.size - 1
        
        return binarySearchInsert(left, right, nums)
        
    }
    
    fun binarySearchInsert(left: Int, right: Int, nums: IntArray): TreeNode?{
        
        if(left > right) return null
        
        val middle = left + ( right - left )/2
        var node = TreeNode(nums[middle])
        node.left = binarySearchInsert(left, middle - 1, nums)
        node.right = binarySearchInsert(middle + 1, right, nums)
        
       return node
        
    }
}